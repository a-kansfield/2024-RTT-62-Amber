package demo.java;

import demo.java.database.dao.OrderDAO;
import demo.java.database.dao.CustomerDAO;
import demo.java.database.entity.Order;
import demo.java.database.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerOrderMain {

    // Class Variables
    private Scanner scan = new Scanner(System.in);
    private OrderDAO orderDAO = new OrderDAO();


    // Runner
    public void run() {
        boolean isEmpty = true;

            Integer customerID = promptUserForCustomerID();
            List<Order> orders = orderDAO.findByCustomerID(customerID);
            printOrders(orders);




    }

    // Prints a list of orders
    public void printOrders(List<Order> orders) {
        System.out.println("ID | Customer Name | Customer ID");
        System.out.println("===========================================");
        for (Order order : orders) {
            System.out.println(order.getId() + " | " + order.getCustomer() + " | " + order.getCustomerID());
        }
    }

    // Handles prompting the user and validating result
    public Integer promptUserForCustomerID() {
        while (true) {
            try {
                System.out.print("\nInput Customer ID: ");
                int result = scan.nextInt();
                return result;
            } catch (Exception e) {
                System.out.println("Please input a valid number");
                scan.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        CustomerOrderMain com = new CustomerOrderMain();
        com.run();
    }


}
