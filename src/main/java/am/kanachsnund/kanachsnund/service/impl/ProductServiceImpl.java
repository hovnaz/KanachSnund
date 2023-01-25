package am.kanachsnund.kanachsnund.service.impl;

import am.kanachsnund.kanachsnund.model.Product;
import am.kanachsnund.kanachsnund.repository.ProductRepository;
import am.kanachsnund.kanachsnund.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        product.setTitle(product.getTitle());
        product.setDescription(product.getDescription());
        return productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

}
