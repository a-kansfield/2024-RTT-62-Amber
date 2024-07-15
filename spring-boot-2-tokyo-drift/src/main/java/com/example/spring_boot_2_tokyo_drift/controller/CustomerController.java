package com.example.spring_boot_2_tokyo_drift.controller;

import com.example.spring_boot_2_tokyo_drift.database.dao.CustomerDAO;
import com.example.spring_boot_2_tokyo_drift.database.dao.EmployeeDAO;
import com.example.spring_boot_2_tokyo_drift.database.entity.Customer;
import com.example.spring_boot_2_tokyo_drift.database.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j              //Simple Logging Framework For Java
@Controller      //Tells Springboot that this is a controller, a go-between for back end (model) and front end (view)
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/customer")
    public ModelAndView customer() {
        ModelAndView response = new ModelAndView("/customer/customer-home");

        List<Customer> customers = customerDAO.findAll();
        response.addObject("customers", customers);

        return response;
    }

    @GetMapping("customer/customer-search")
    public ModelAndView customerSearch(@RequestParam(required = false) String search) {
        ModelAndView response = new ModelAndView("customer/customer-search");
        response.addObject("search", search );

        List<Customer> customers = customerDAO.findByNameOrCode(search);
        response.addObject("customers", customers);

        return response;
    }

    @GetMapping("customer/customer-search-by-rep")
    public ModelAndView customerSearchBySalesRep(@RequestParam(required = false) Integer search) {
        ModelAndView response = new ModelAndView("customer/customer-search-by-rep");
        response.addObject("search", search);


        List<Customer> customers = customerDAO.findBySalesRepID(search);
        response.addObject("customers", customers);

        Employee employee = employeeDAO.findById(search);
        response.addObject("employee", employee);

        return response;
    }
    @GetMapping("customer/{id}")
    public ModelAndView customerPathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("customer/customer");

        Customer customer = customerDAO.findById(id);
        response.addObject("customer", customer);

        return response;
    }

//    @GetMapping("customer/sales-rep/{id}")
//    public ModelAndView customerSalesRepPathVar(@PathVariable Integer id) {
//        ModelAndView response = new ModelAndView("customer/customer-search2");
//
//        List<Customer> customers = customerDAO.findBySalesRepID(id);
//        response.addObject("customers", customers);
//
//        return response;
//    }
}
