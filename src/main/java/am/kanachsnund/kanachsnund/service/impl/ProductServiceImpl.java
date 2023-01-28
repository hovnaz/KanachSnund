package am.kanachsnund.kanachsnund.service.impl;

import am.kanachsnund.kanachsnund.dto.request.ProductCrudRequest;
import am.kanachsnund.kanachsnund.dto.response.ProductResponse;
import am.kanachsnund.kanachsnund.entity.Product;
import am.kanachsnund.kanachsnund.mapper.ProductCrudMapper;
import am.kanachsnund.kanachsnund.repository.ProductRepository;
import am.kanachsnund.kanachsnund.service.ProductService;
import am.kanachsnund.kanachsnund.util.IOUtil;
import am.kanachsnund.kanachsnund.util.ImageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductCrudMapper productCrudMapper;
    private final IOUtil ioUtil;
    @Value("${project.images.product}")
    private String folderPath;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void save(ProductCrudRequest productRequest) {
        Product product = productCrudMapper.toEntity(productRequest);
        productRepository.save(product);
    }

    @Override
    public void update(int id, ProductCrudRequest productRequest) {
        boolean existsById = productRepository.existsById(id);
        if (existsById) {
            Product product = productCrudMapper.toEntity(productRequest);
            productRepository.save(product);
        }

    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductResponse> findAllByIdAndProductByLanguage(String language) {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(val -> productConvertToResponse(val, language.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public byte[] getImage(String fileName) {
        return ioUtil.getAllBytesByUrl(folderPath + File.separator + fileName);
    }

    @Override
    public String saveImage(MultipartFile file) throws IOException {
        byte[] bytearray = ImageUtil.compressImage(file.getBytes());
        BufferedImage imag = ImageIO.read(new ByteArrayInputStream(bytearray));
        ImageIO.write(imag, "jpg", new File(folderPath, "snap.jpg"));
        return file.getOriginalFilename();
    }

    private ProductResponse productConvertToResponse(Product product, String language) {
        switch (language) {
            case "us":
                return ProductResponse.builder()
                        .title(product.getTitleUs())
                        .description(product.getDescriptionUs())
                        .image(product.getImage())
                        .build();

            case "ru":
                return ProductResponse.builder()
                        .title(product.getTitleRu())
                        .description(product.getDescriptionRu())
                        .image(product.getImage())
                        .build();
            default:
                return ProductResponse.builder()
                        .title(product.getTitleHy())
                        .description(product.getDescriptionHy())
                        .image(product.getImage())
                        .build();
        }
    }
}
