package com.iss.core.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model) {
        System.out.println("mini pro 首页方法...");
        model.addAttribute("info", "mini pro 首页方法...");
        return "index";
    }
}
