package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.FeedbackRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FeedbackController {

    @PostMapping("/feedback")
    public String addProductComment(@Valid @ModelAttribute FeedbackRequest feedbackRequest) {
        System.out.println("");
        return "redirect:/";
    }

}
