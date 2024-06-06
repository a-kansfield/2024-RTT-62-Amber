package demo.java;

import demo.java.database.entity.Customer;
import demo.java.database.dao.CustomerDAO;

import java.util.List;
import java.util.Scanner;

public class CustomerQueryDemo {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        Scanner scan = new Scanner(System.in);

//        Customer newCustomer = new Customer("Caroline's Cat Cafe", "Caroline", "Mars",
//                                            "555-421-5732", "488 Pawsome Lane", "Chicago", "USA");
//
//        // Insert:
//        customerDAO.insert(newCustomer);
//
//        List<Customer> customer = customerDAO.findByContactFirstName("Caroline");
//        for (Customer c : customer) {
//            //customerDAO.delete(c);
//            //Update:
//            c.setState("IL");
//            customerDAO.update(c);
//        }

        //Query a customer from the database based on an id using the findById method (522 is my custom addition)
        Customer customer = customerDAO.findByID(522);

        //Use the scanner to ask the user to enter a first name and then enter a last name
        //Modify the customer contact first name and last name to be the values gathered by the scanner customer.setContactFirstName(inputFromScanner);
        System.out.print("Input contact first name \n>>");
        customer.setContactFirstName(scan.nextLine());

        System.out.print("Input contact last name \n>>");
        customer.setContactLastName(scan.nextLine());

        //Then save the customer that you just modified to the database
        customerDAO.update(customer);



        //System.out.println(customer);

    }
}
