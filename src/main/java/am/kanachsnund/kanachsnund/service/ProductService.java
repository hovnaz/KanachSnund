package am.kanachsnund.kanachsnund.service;

import am.kanachsnund.kanachsnund.dto.ProductResponse;
import am.kanachsnund.kanachsnund.model.Product;

import java.util.List;
import java.util.Locale;

public interface ProductService {

    List<Product> findAllProduct();
//
//    void addProduct(Product product);
//
//    Product update(Product product);
//
//    void deleteById(int id);

    List<ProductResponse> findAllByIdAndProductByLanguage(String language);
}
