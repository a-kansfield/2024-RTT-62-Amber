package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView response =  new ModelAndView("index");
        return response;
    }

    @GetMapping("/another-page")
    public ModelAndView anotherPage() {
        ModelAndView response = new ModelAndView("another-page");

        return response;
    }

}
