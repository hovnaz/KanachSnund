package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.ProductResponse;
import am.kanachsnund.kanachsnund.model.Product;
import am.kanachsnund.kanachsnund.service.ProductService;
import am.kanachsnund.kanachsnund.state.MenuState;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Value("${kanachsnund.images.folder}")
    private String productImages;

    @GetMapping
    public String mainPage(ModelMap modelMap) {
        List<ProductResponse> productList = productService.findAllByIdAndProductByLanguage(LocaleContextHolder.getLocale().getLanguage());
        modelMap.addAttribute("productMenuList", productList);
        return "pages/home";
    }

    @GetMapping("/menu")
    public String menu(ModelMap modelMap){
        List<Product> allProduct = productService.findAllProduct();
        modelMap.addAttribute("products", allProduct);
        return "pages/menu";
    }

    @GetMapping("/getImage")
    public @ResponseBody byte[] getImage(@RequestParam("fileImage") String fileName) throws IOException, IOException {
        InputStream inputStream = new FileInputStream(productImages + File.separator + fileName);
        return IOUtils.toByteArray(inputStream);
    }
}
