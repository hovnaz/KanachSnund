package am.kanachsnund.kanachsnund.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContactRequest {

    private String name;
    private String email;
    private String message;
}
