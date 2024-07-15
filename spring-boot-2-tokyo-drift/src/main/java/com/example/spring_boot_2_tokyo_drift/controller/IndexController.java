package com.example.spring_boot_2_tokyo_drift.controller;


import com.example.spring_boot_2_tokyo_drift.database.dao.EmployeeDAO;
import com.example.spring_boot_2_tokyo_drift.database.dao.ProductDAO;
import com.example.spring_boot_2_tokyo_drift.database.entity.Employee;
import com.example.spring_boot_2_tokyo_drift.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class IndexController {
    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private EmployeeDAO employeeDAO;

    //Maps the URI portion of the URL
    // this function is for the home page of the website which is express as just a plain slash "/"
    @GetMapping("/")
    public ModelAndView index(@RequestParam(required = false) Integer id) {

        // if the id parameter is not present on the URL then the incoming id will be null
        ModelAndView response = new ModelAndView("index");

        // by default the logging level is set to info so the debug message will not be printed in the terminal
//        log.debug("Debug level");
//        log.info("Info level");
//        log.warn("Warn level");
//        log.error("Error level");

        return response;
    }





    @GetMapping("/another-page")
    public ModelAndView canBeAnyFunctionNameYouWant() {
        ModelAndView response = new ModelAndView("another-page");
        return response;
    }








    // I am naming the mapping, function, and viewName identically.
    // I don't NEED to do this, but am for consistency's sake.
    @GetMapping("/homework")
    public ModelAndView homework(@RequestParam(required = false) String homeworkVar) {
        ModelAndView response = new ModelAndView("homework");
        response.addObject("homeworkMessage", homeworkVar);
        return response;
    }

    // Toggle between employee and product searches
    @GetMapping("/combo-search")
    public ModelAndView comboSearch(@RequestParam(required=false) String search, String radio) {
        ModelAndView response = new ModelAndView("combo-search");
        return response;
    }

    //combo-search with path variables
    @GetMapping("/{radio}/{id}")
    public ModelAndView comboSearch(){
        ModelAndView response = new ModelAndView("combo-search");
        return response;
    }


}
