package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.ProductResponse;
import am.kanachsnund.kanachsnund.service.ProductService;
import am.kanachsnund.kanachsnund.state.MenuState;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String mainPage(ModelMap modelMap) {
        List<ProductResponse> productList = productService.findAllByIdAndProductByLanguage(LocaleContextHolder.getLocale().getLanguage());
        modelMap.addAttribute("productMenuList", productList);
        return "pages/home";
    }

    @GetMapping("/menu")
    public String MenuPage() {

        return "pages/menu";
    }
}
