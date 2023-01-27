package am.kanachsnund.kanachsnund.mapper;

import am.kanachsnund.kanachsnund.dto.request.ProductCrudRequest;
import am.kanachsnund.kanachsnund.dto.response.ProductCrudResponse;
import am.kanachsnund.kanachsnund.entity.Product;
import am.kanachsnund.kanachsnund.mapper.base.BaseMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCrudMapper implements BaseMapper<Product, ProductCrudRequest, ProductCrudResponse> {

    private final ModelMapper modelMapper;

    @Override
    public Product toEntity(ProductCrudRequest productCrudRequest) {
        return modelMapper.map(productCrudRequest, Product.class);
    }

    @Override
    public ProductCrudResponse toResponse(Product product) {
        return modelMapper.map(product, ProductCrudResponse.class);
    }
}
