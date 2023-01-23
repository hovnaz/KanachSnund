package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.model.User;
import am.kanachsnund.kanachsnund.repository.UserRepository;
import am.kanachsnund.kanachsnund.service.ProductService;
import am.kanachsnund.kanachsnund.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class AdminController {
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    @GetMapping("/add")
    public String userAddPage(){
        return "addUser";
    }

    @PostMapping("/add")
    public String userAdd(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/";
    }

}
