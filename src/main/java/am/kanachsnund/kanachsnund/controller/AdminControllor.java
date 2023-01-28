package am.kanachsnund.kanachsnund.controller;

import am.kanachsnund.kanachsnund.dto.request.ProductCrudRequest;
import am.kanachsnund.kanachsnund.entity.Contact;
import am.kanachsnund.kanachsnund.entity.Feedback;
import am.kanachsnund.kanachsnund.repository.CommentRepository;
import am.kanachsnund.kanachsnund.repository.ContactRepository;
import am.kanachsnund.kanachsnund.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.validation.Valid;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminControllor {

    private final ProductService productService;
    private final CommentRepository commentRepository;
    private final ContactRepository contactRepository;
    @Value("${project.images.product}")
    private String folderPath;

    @PostMapping("/product/create")
    public String createProduct(@RequestParam(value = "image") MultipartFile file) throws IOException {
        BufferedImage image = ImageIO.read(file.getInputStream());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

// Compress the image
        ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
        ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(0.5f); // Quality of compression

        writer.write(null, new IIOImage(image, null, null), param);
        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();

// Save the compressed image to a local file
        byte[] imageInByte = baos.toByteArray();
        FileOutputStream fos = new FileOutputStream(folderPath + File.separator + fileName);
        fos.write(imageInByte);
        fos.close();
        baos.close();

        return "redirect:/admin/products";
    }

    @GetMapping("/product")
    public String createProductPage() {
        return "pages/admin/product-create";
    }

    @PostMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, @ModelAttribute @Valid ProductCrudRequest productCrudRequest) {
        productService.update(id, productCrudRequest);
        return "redirect:/admin/products";
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
