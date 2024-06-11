package org.example.database.dao;

import demo.java.database.dao.CustomerDAO;
import demo.java.database.dao.EmployeeDAO;
import demo.java.database.entity.Customer;
import demo.java.database.entity.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeDAOTest {
    private static EmployeeDAO employeeDAO = new EmployeeDAO();

    @BeforeAll
    public static void beforeAll() {
        List<Employee> employees = employeeDAO.findByFirstName("Chilchuck");
        for (Employee employee : employees) {
            employeeDAO.delete(employee);
        }
    }
    @AfterAll
    public static void afterAll() {
        List<Employee> employees = employeeDAO.findByFirstName("Chilchuck");
        for (Employee employee : employees) {
            employeeDAO.delete(employee);
        }
    }
    @Test
    public void findByIdTest() {
        // given
        Integer empID = 1002;

        // when
        Employee employee = employeeDAO.findById(empID);

        // then
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(empID, employee.getId());
        Assertions.assertEquals("Gary", employee.getFirstname());
    }

    @Test
    public void findByIdInvalidTest() {
        // given
        Integer empID = 1;

        // when
        Employee employee = employeeDAO.findById(empID);

        // then
        Assertions.assertNull(employee);
    }

    @Test
    public void findByFirstNameTest() {
        // given
        String firstName = "Gary";

        // when
        List<Employee> employees = employeeDAO.findByFirstName(firstName);

        // then
        Assertions.assertNotNull(employees);
            //I know that even if a second employee with the first name "Gary" is input, the first instance in the list will be the CEO - Gary Larson with an ID of 1002
        Assertions.assertEquals(1002, employees.get(0).getId());
            // I can't future-proof every Gary, I can at least check that every employee in the list does actually have the first name Gary.
        for (Employee employee : employees) {
            Assertions.assertEquals("Gary", employee.getFirstname());
        }
    }

    @Test
    public void findByFirstNameInvalidTest() {
        // given
        String firstName = "gjkflnklsfd76";

        // when
        List<Employee> employees = employeeDAO.findByFirstName(firstName);

        // then
        Assertions.assertTrue(employees.isEmpty()); //Value of the list won't be null, but it will be empty.
    }

    @Test
    public void createNewEmployee() {
        //given
        Employee given = new Employee(1, "Chilchuck", "Tims",
                "x1200", "tims@halffootUnion.org", "Picklock");

        //when
        employeeDAO.insert(given);

        //then
        //For now, find by ID would not work. Every time this is run, it doesn't roll back auto_increment, so ID gets larger everytime.
        List<Employee> employees = employeeDAO.findByFirstName("Chilchuck");
        Assertions.assertEquals("Chilchuck", employees.get(0).getFirstname());

    }
}
