package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.FeedbackRequest;
import am.kanachsnund.kanachsnund.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;

    @PostMapping("/feedback")
    public String addProductComment(@Valid @ModelAttribute FeedbackRequest feedbackRequest) {
        feedbackService.save(feedbackRequest);
        return "redirect:/";
    }

}
