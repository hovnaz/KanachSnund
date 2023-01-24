package am.kanachsnund.kanachsnund.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FeedbackRequest {

    @Email
    private String email;
    @NotBlank
    @Size(min = 4, max = 255)
    private String message;
}
