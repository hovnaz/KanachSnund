package am.kanachsnund.kanachsnund.service;

import am.kanachsnund.kanachsnund.dto.request.ProductCrudRequest;
import am.kanachsnund.kanachsnund.dto.response.ProductCrudResponse;
import am.kanachsnund.kanachsnund.dto.response.ProductResponse;
import am.kanachsnund.kanachsnund.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<Product> findAllProduct();

    void save(ProductCrudRequest productRequest);

    void update(int id, ProductCrudRequest productRequest);

    void deleteById(int id);

    List<ProductResponse> findAllByIdAndProductByLanguage(String language);

    byte[] getImage(String fileName);

    String saveImage(MultipartFile file) throws IOException;

    Product findById(int id);
}
