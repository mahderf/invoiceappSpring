package basicinvoiceapp.invoiceapp.invoiceControllers;

import basicinvoiceapp.invoiceapp.Invoiceapp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Minvcontrollers {
    @RequestMapping("/index")
    public String newindex(Model nmodl)
    {
        String msgs="Welcome to the invoice app";
        nmodl.addAttribute("myMessage", msgs);
        return "newindex";
    }
    @RequestMapping("/login")
    public String logindex(Model lmod)
    {
       String lmsg="This is the login page";
        lmod.addAttribute("myMessage",lmsg);
        return "newindex";
    }
    @GetMapping("/addproduct")
    public String adprdct(Model pmod)
    {
        //String pmsg="Add the product here";
        pmod.addAttribute("newindex",new Invoiceapp());
        return "newindex";
    }
    @PostMapping("/addproduct")
    public String productSubmit(@ModelAttribute ("map")Invoiceapp newindex)
    {
        //System.out.println(invoice.getPdsc());
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
