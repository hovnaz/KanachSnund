package am.kanachsnund.kanachsnund.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductCrudRequest {

    private String titleUs;
    private String titleRu;
    private String titleHy;
    private String descriptionUs;
    private String descriptionRu;
    private String descriptionHy;
    private String image;
}
