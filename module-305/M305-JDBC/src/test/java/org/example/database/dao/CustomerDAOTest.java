package org.example.database.dao;

import demo.java.database.dao.CustomerDAO;
import demo.java.database.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomerDAOTest {

    private static CustomerDAO customerDAO = new CustomerDAO();

    @BeforeAll
    public static void beforeAll() {
        // we could write some code to delete any customer from the database that has the "Test Customer"
        List<Customer> customers = customerDAO.findByCustomerName("Test Customer");
        for (Customer customer : customers) {
            customerDAO.delete(customer); //Pretty bootjank but what can ya do.
        }

    }
    @Test
    public void findByIdTest() {
        // given
        Integer userid = 103;
        // when
        Customer customer = customerDAO.findByID(userid);
        // then
        // the expected value, meaning the value you are expecting it to be is the first argument
        Assertions.assertNotNull(customer);
        Assertions.assertEquals(userid, customer.getId());
        Assertions.assertEquals("Atelier graphique", customer.getCustomerName());
        Assertions.assertEquals("Schmitt", customer.getContactLastName());
        Assertions.assertEquals("Carine", customer.getContactFirstName());
    }

    @Test
    public void findByInvalidIdTest() {
        //given
        Integer userid = 103033;
        //when
        Customer customer = customerDAO.findByID(userid);
        //then
        Assertions.assertNull(customer);
    }

    @Test
    public void createNewCustomer() {
        //given
        Customer given = new Customer(
                "Test Customer", "Firstname", "Lastname",
                "555-555-5531", "123 Address", "City", "Country");

        //when
        customerDAO.insert(given);

        //then
        Customer actual = customerDAO.findByID(given.getId());
        Assertions.assertEquals(given.getCustomerName(), actual.getCustomerName());
        Assertions.assertEquals(given.getContactFirstName(), actual.getContactFirstName());
    }
}
