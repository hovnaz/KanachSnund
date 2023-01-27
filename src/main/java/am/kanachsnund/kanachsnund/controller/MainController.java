package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.response.ProductResponse;
import am.kanachsnund.kanachsnund.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final ProductService productService;

    @GetMapping("/")
    public String mainPage(ModelMap modelMap) {
        List<ProductResponse> productList = productService.findAllByIdAndProductByLanguage(LocaleContextHolder.getLocale().getLanguage());
        modelMap.addAttribute("productMenuList", productList);
        return "pages/home";
    }

    @GetMapping("/menu")
    public String menuPage(ModelMap modelMap) {
        List<ProductResponse> productList = productService.findAllByIdAndProductByLanguage(LocaleContextHolder.getLocale().getLanguage());
        modelMap.addAttribute("productMenuList", productList);
        return "pages/menu";
    }

    @GetMapping("/about-us")
    public String aboutUsPage() {
        return "pages/about-us";
    }

    @GetMapping("/contact-us")
    public String contactUsPage() {
        return "pages/contact-us";
    }
}
