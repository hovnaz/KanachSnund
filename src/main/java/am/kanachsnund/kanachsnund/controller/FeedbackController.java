package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.request.ContactRequest;
import am.kanachsnund.kanachsnund.dto.request.FeedbackRequest;
import am.kanachsnund.kanachsnund.entity.Contact;
import am.kanachsnund.kanachsnund.mapper.ContactMapper;
import am.kanachsnund.kanachsnund.repository.ContactRepository;
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
    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    @PostMapping("/feedback")
    public String addProductComment(@Valid @ModelAttribute FeedbackRequest feedbackRequest) {
        feedbackService.save(feedbackRequest);
        return "redirect:/";
    }

    @PostMapping("/contact-us")
    public String contactUs(@ModelAttribute ContactRequest contactRequest) {
        Contact contact = contactMapper.toEntity(contactRequest);
        contactRepository.save(contact);
        return "redirect:/contact-us";
    }
}
