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
public class ProductController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/product")
    public ModelAndView product() {
        ModelAndView response = new ModelAndView("/product/product-home");

        List<Product> products = productDAO.findAll();
        response.addObject("products", products);

        return response;

    }

    @GetMapping("product/{id}")
    public ModelAndView productPathVar(@PathVariable Integer id) {

        // if the id parameter is not present on the URL then the incoming id will be null
        ModelAndView response = new ModelAndView("product/product");

        Product product = productDAO.findById(id);
        response.addObject("product", product);

        return response;
    }

    @GetMapping("product/product-search")
    public ModelAndView search(@RequestParam(required = false) String search) {
        ModelAndView response = new ModelAndView("product/product-search");

        log.debug("The user searched for the term" + search);
        response.addObject("search", search);

        List<Product> products = productDAO.findByNameOrCode(search);
        response.addObject("products", products);
        return response;
    }
}
