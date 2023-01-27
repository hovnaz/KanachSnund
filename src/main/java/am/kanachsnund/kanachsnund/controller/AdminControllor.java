package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.request.ProductCrudRequest;
import am.kanachsnund.kanachsnund.entity.Contact;
import am.kanachsnund.kanachsnund.entity.Feedback;
import am.kanachsnund.kanachsnund.repository.CommentRepository;
import am.kanachsnund.kanachsnund.repository.ContactRepository;
import am.kanachsnund.kanachsnund.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminControllor {

    private final ProductService productService;
    private final CommentRepository commentRepository;
    private final ContactRepository contactRepository;

    @PostMapping("/create")
    public String createProduct(@ModelAttribute @Valid ProductCrudRequest productCrudRequest) {
        productService.save(productCrudRequest);
        return "redirect:/admin/product";
    }

    @PostMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, @ModelAttribute @Valid ProductCrudRequest productCrudRequest) {
        productService.update(id, productCrudRequest);
        return "redirect:/admin/product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteById(id);
        return "redirect:/admin/product";
    }

    @GetMapping("/products")
    public String productsPage(ModelMap modelMap) {
        modelMap.addAttribute("productsList", productService.findAllProduct());
        return "pages/admin/products";
    }

    @GetMapping("/feedback")
    public String feedbackList(ModelMap modelMap) {
        List<Feedback> feedbackList = commentRepository.findAll();
        modelMap.addAttribute("feedbacks", feedbackList);
        return "pages/admin/feedback";
    }

    @GetMapping("/contact-us")
    public String contactUsList(ModelMap modelMap) {
        List<Contact> contactList = contactRepository.findAll();
        modelMap.addAttribute("contacts", contactList);
        return "pages/admin/contact-us";
    }


}
