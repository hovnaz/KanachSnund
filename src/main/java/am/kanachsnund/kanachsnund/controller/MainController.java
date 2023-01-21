package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.state.MenuState;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String mainPage(ModelMap modelMap) {
        modelMap.addAttribute(String.valueOf(MenuState.x), "productMenuList");
        return "pages/home";
    }
}
