package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.model.Comment;
import am.kanachsnund.kanachsnund.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @PostMapping()
    public String comment(@RequestParam(value = "email") String email,
                          @RequestParam(value = "comment") String comment){
        commentService.saveComment(email, comment);
        return "redirect:/";
    }
}
