package basicinvoiceapp.invoiceapp.invoiceControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping("/addproduct")
    public String adprdct(Model pmod)
    {
        String pmsg="Add the product here";
        pmod.addAttribute("myMessage",pmsg);
        return "newindex";

    }
    @RequestMapping("/listproducts")
    public String lstprdct(Model lstmod)
    {
        String lstmsg="The dependencies used are: 1: Web, 2:thymeleaf";
        lstmod.addAttribute("myMessage", lstmsg);
        return "newindex";
    }
}
