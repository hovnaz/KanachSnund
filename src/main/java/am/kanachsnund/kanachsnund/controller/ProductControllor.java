package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.model.Product;
import am.kanachsnund.kanachsnund.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class ProductControllor {

//    @Value("${kanachsnund.images.folder}")
//    private String productImages;
//    private final ProductService productService;
//
//    @GetMapping()
//    public String getAllProduct(ModelMap modelMap){
//        List<Product> allProduct = productService.findAllProduct();
//        modelMap.addAttribute("products", allProduct);
//        return "tmpIndex";
//    }
//
//    @GetMapping("/add")
//    public String addProductPage(){
//        return "addProduct";
//    }
//
//    @PostMapping("/add")
//    public String addProduct(@ModelAttribute Product product){
//        productService.addProduct(product);
//        return "redirect:/product";
//    }
//
//    @GetMapping("/getImage")
//    public @ResponseBody byte[] getImage(@RequestParam("fileImage") String fileName) throws IOException {
//        InputStream inputStream = new FileInputStream(productImages + File.separator + fileName);
//        return IOUtils.toByteArray(inputStream);
//    }
////editing
////    @PostMapping("/update")
////    public String updateProduct(@RequestParam Product product){
////        productService.update(product);
////        return
////    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable("id") int id){
//        productService.deleteById(id);
//        return "redirect:/product";
//    }

}