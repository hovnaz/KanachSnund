//package am.kanachsnund.kanachsnund.mapper;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class ProductMapper {
//    private final ModelMapper modelMapper;
//
//    @Override
//    public CategoryParent toEntity(CategoryParentRequest categoryParentRequest) {
//        return modelMapper.map(categoryParentRequest, CategoryParent.class);
//    }
//
//    @Override
//    public CategoryParentResponse toResponse(CategoryParent categoryParent) {
//        return modelMapper.map(categoryParent, CategoryParentResponse.class);
//    }
//}