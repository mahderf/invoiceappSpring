package basicinvoiceapp.invoiceapp.invoiceControllers;

import basicinvoiceapp.invoiceapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class Minvcontrollers {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String showindex(Model model)
    {
       String myMessage="This is the login page";
        model.addAttribute("message",myMessage);
        return "index";
    }
    @GetMapping("/addproduct")
    public String addProduct(Model model)
    {
        //String pmsg="Add the product here";
        model.addAttribute("newinvoiceapp",new Invoiceapp());
        return "addproduct";
    }
    @PostMapping("/addproduct")
    public String postProduct(@Valid @ModelAttribute ("newinvoiceapp")Invoiceapp otherinvoiceapp, BindingResult bindingResult)
    {
       if(bindingResult.hasErrors()) {
           return "addproduct";
       }
        productRepository.save(otherinvoiceapp);
        return "result";
    }





}
