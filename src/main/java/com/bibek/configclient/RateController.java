package com.bibek.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RateController {

    @Value("${greeting}")
    String rate;
    
    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateAmount", rate);
        return "rateview";
    }
}
