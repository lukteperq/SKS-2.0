package no.hist.tdat.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Side1Controller {

    @RequestMapping("/side1.htm")
    public String redirect()
    {
        return "sideen";
    }
}