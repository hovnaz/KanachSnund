package am.kanachsnund.kanachsnund.service.impl;

import am.kanachsnund.kanachsnund.dto.ProductResponse;
import am.kanachsnund.kanachsnund.model.Language;
import am.kanachsnund.kanachsnund.model.Product;
import am.kanachsnund.kanachsnund.repository.ProductRepository;
import am.kanachsnund.kanachsnund.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductResponse> findAllByIdAndProductByLanguage(String language) {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(val -> productConvertToResponse(val, language.toLowerCase())).collect(Collectors.toList());
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
