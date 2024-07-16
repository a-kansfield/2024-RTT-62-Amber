package com.example.spring_boot_2_tokyo_drift.controller;
import com.example.spring_boot_2_tokyo_drift.database.dao.EmployeeDAO;
import com.example.spring_boot_2_tokyo_drift.database.entity.Employee;
import com.example.spring_boot_2_tokyo_drift.form.CreateEmployeeFormBean;
import lombok.ToString;
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
//@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employee")
    public ModelAndView employee() {
        ModelAndView response = new ModelAndView("/employee/employee-home");

        List<Employee> employees = employeeDAO.findAll();
        response.addObject("employees", employees);
        return response;
    }
    @GetMapping("employee/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("employee/create");
        List<Employee> employees = employeeDAO.findAll();
        response.addObject("reportsToEmployees", employees);

        return response;

    }
    @GetMapping("employee/submit")
    public ModelAndView submit(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("");

        log.debug(form.toString());

        Employee employee = new Employee();
        employee.setEmail(form.getEmail());
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setReportsTo(form.getReportsTo());
        employee.setOfficeID(1);
        employee.setExtension("x123");
        employee.setJobTitle("Sales Rep");

        employee = employeeDAO.save(employee);

        response.setViewName("redirect:/customer/customer-search-by-rep?search=" + employee.getId());
        return response;

    }
    @GetMapping("employee/employee-search")
    public ModelAndView employeeSearch(@RequestParam(required = false) String search) {
        ModelAndView response = new ModelAndView("employee/employee-search");

        response.addObject("search", search);
        List<Employee> employees = employeeDAO.findByNameOrCode(search);

        response.addObject("employees", employees);
        return response;
    }
    @GetMapping("employee/{id}")
    public ModelAndView employeePathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("employee/employee");

        Employee employee = employeeDAO.findById(id);
        response.addObject("employee", employee);

        return response;
    }
}
