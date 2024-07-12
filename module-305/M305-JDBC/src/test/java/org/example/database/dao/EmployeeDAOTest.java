package org.example.database.dao;

import demo.java.database.dao.CustomerDAO;
import demo.java.database.dao.EmployeeDAO;
import demo.java.database.entity.Customer;
import demo.java.database.entity.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource(
            {
                    "Leslie",
                    "Tom"
            }
    )
    public void findByFirstNameTest(String firstName) {
        // given

        // when
        List<Employee> employees = employeeDAO.findByFirstName(firstName);

        // then
       Assertions.assertTrue(employees.size() > 0);
        for (Employee employee : employees) {
            Assertions.assertEquals(firstName, employee.getFirstname());
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
