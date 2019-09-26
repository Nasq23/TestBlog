package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController{
    @RequestMapping("/Animals")
    public String animals(){
        return "Animals";
    }

    @RequestMapping("/Home")
    public String home(){
        return "Home";
    }

    @RequestMapping("/About")
    public String about(){
        return "About";
    }

    @RequestMapping("/Contact")
    public String contact(){
        return "Contact";
    }

    @RequestMapping("/blog")
    public String blog(){
        return "Blog";
    }





}