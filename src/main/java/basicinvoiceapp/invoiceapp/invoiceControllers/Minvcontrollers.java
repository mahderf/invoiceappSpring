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

    @RequestMapping("/")
    public String logindex(Model model)
    {
       String message="This is the login page";
        model.addAttribute("Message",message);
        return "firstln";
    }
    @GetMapping("/addproduct")
    public String adprdct(Model model)
    {
        //String pmsg="Add the product here";
        model.addAttribute("newindex",new Invoiceapp());
        return "newindex";
    }
    @PostMapping("/addproduct")
    public String productSubmit(@Valid @ModelAttribute ("newindex")Invoiceapp newindex, BindingResult bindingResult)
    {
       if(bindingResult.hasErrors()) {
           return "addproduct";
       }
        productRepository.save(newindex);
        return "indextwo";
    }


    @RequestMapping("/listproducts")
    public String lstprdct(Model lstmod)
    {
        String lstmsg="This are the List of products";
        String lstmsg2="The dependencies used are: 1: Web, 2:thymeleaf";
        lstmod.addAttribute("myMessage", lstmsg);
        lstmod.addAttribute("message", lstmsg2);
        return "newindex";
    }


}
