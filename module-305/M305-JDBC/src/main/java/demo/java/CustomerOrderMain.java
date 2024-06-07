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
        if (orders.size() >= 1) {
            System.out.println("\nOrder Status for Customer -- " + orders.get(0).getCustomer().getCustomerName() + "\n");
            System.out.println("ID | Order Date | Status | Customer Name | Customer ID");
            System.out.println("===========================================");
            for (Order order : orders) {
                System.out.println(order.getId() + " | " + order.getOrderDate() + " | " + order.getStatus() + " | " + order.getCustomer().getCustomerName() + " | " + order.getCustomerID());
            }
        } else {
            System.out.println("No orders associated with given Customer ID");
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
