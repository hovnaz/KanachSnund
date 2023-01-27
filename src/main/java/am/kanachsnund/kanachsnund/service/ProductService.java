package am.kanachsnund.kanachsnund.service;

import am.kanachsnund.kanachsnund.dto.request.ProductCrudRequest;
import am.kanachsnund.kanachsnund.dto.response.ProductResponse;
import am.kanachsnund.kanachsnund.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProduct();

    void save(ProductCrudRequest productRequest);

    void update(int id, ProductCrudRequest productRequest);

    void deleteById(int id);

    List<ProductResponse> findAllByIdAndProductByLanguage(String language);
}
