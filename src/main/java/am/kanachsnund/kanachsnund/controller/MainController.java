package am.kanachsnund.kanachsnund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String mainPage() {

        return "pages/home";
    }

    @GetMapping("/menu")
    public String MenuPage() {

        return "pages/menu";
    }
}
