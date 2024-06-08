package demo.java;

import demo.java.database.dao.OrderDAO;
import demo.java.database.dao.OrderDetailsDAO;
import demo.java.database.dao.ProductDAO;
import demo.java.database.entity.Customer;
import demo.java.database.entity.Order;
import demo.java.database.entity.OrderDetails;
import demo.java.database.entity.Product;

import java.util.Scanner;

public class AddProductToOrder {
    // Load an order from the database by id
    // 2) Load a product from the database by id
    // 3) Create a new OrderDetails object and add the order and the product
    // 4) Save the OrderDetails object to the database
    private OrderDAO orderDAO = new OrderDAO();
    private ProductDAO productDAO = new ProductDAO();
    private OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();
    private Scanner scan = new Scanner(System.in);

    public void run() {
        Order order = orderDAO.findByOrderID(10100);
        System.out.println(order);

        Customer customer = order.getCustomer();
        System.out.println("This order is for customer with an id = " + customer.getId() + " and name = " + customer.getCustomerName());

        for (OrderDetails od : order.getOrderDetails()) {
            System.out.println(od.getProduct().getProductName() + " | " + od.getQuantityOrdered() + " | " + od.getPriceEach());
        }

        Product product = productDAO.findByID(11);
        System.out.println(product);




        OrderDetails orderDetails = orderDetailsDAO.findByOrderIdAndProductId(order.getId(), product.getId());
        if (orderDetails == null) {
            orderDetails = new OrderDetails();
        }

        if (orderDetails.getQuantityOrdered() == null) {
            orderDetails.setQuantityOrdered(1);
        } else {
            orderDetails.setQuantityOrdered(orderDetails.getQuantityOrdered() + 1);
        }
        orderDetails.setProduct(product);
        orderDetails.setOrder(order);

        orderDetails.setQuantityOrdered(100);
        orderDetails.setPriceEach(product.getMsrp());
        orderDetails.setOrderLineNumber(10);

        if (orderDetails.getId() == null) {

            orderDetailsDAO.insert(orderDetails);
        } else {
            orderDetailsDAO.update(orderDetails);
        }

    }

    public static void main(String[] args) {
        AddProductToOrder apto = new AddProductToOrder();
        apto.run();
    }
}
