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
    public List<ProductResponse> findAllByIdAndProductByLanguage(String language) {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(val -> productConvertToResponse(val, language.toLowerCase())).collect(Collectors.toList());
    }

}
