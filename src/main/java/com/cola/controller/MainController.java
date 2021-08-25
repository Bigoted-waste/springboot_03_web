package com.cola.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/mainAll")
    public String main1(){
        return "redirect:/main.html";
    }
}
