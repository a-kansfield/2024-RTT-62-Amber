package demo.java;

import demo.java.database.dao.ProductDAO;
import demo.java.database.entity.Product;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

    // I Want to be able to search for a product and then change the quantity in stock to reflect current inventory levels.
    // 1) I need to be able to prompt the user for which product to search for
    // 2) I need to be able to show the products and allow the user to select a product to modify
    // 3) I need to prompt the user to enter the new value quantity in stock
    // 4) I need to set the new quantity in stock on the product and save it to the database

    private ProductDAO productDAO = new ProductDAO();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        String productName = inputProductSearch();
        List<Product> products = productDAO.findLikeName(productName);

        Product selectedProduct = null;

        while(selectedProduct == null) {
            int productId = promptForProductId();

            selectedProduct = productDAO.findByID(productId);
            if (selectedProduct == null) {
                System.out.println("You have entered an invalid product id");
            }
        }

        int quantity = promptQuantityInStock();
        System.out.println(quantity);

        updateQuantityInStock(selectedProduct, quantity);

//            //printProducts(products);
//            Product selectedProduct = productDAO.findByID(productID);
//            System.out.println(selectedProduct);
//
//            int quantity = promptQuantityInStock();
//            System.out.println(quantity);
//
//

    }

    public void updateQuantityInStock(Product product, int quantity) {
        product.setQuantityInStock(quantity);
        productDAO.update(product);
    }
    public int promptQuantityInStock () {
        while (true) {
            try {
                System.out.println("Enter the new value for quantity in stock: ");
                int quantity = scanner.nextInt();
                return quantity;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    public void printProducts(List<Product> products) {
        System.out.println("ID | Product Name | Quantity In Stock");
        System.out.println("===========================================");
        for (Product product: products) {
            System.out.println(product.getId() + " | " + product.getProductName() + " | " + product.getQuantityInStock());
        }
    }

    public int promptForProductId() {
        while(true){
            try {
                System.out.print("\nEnter the product ID to modify: ");
                int id = scanner.nextInt();
                return id;
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
    public String inputProductSearch() {
        System.out.print("Enter a product name to search for: ");
        String productName = scanner.nextLine();
        return productName;
    }

    public static void main(String[] args) {
        ProductMain pm = new ProductMain();
        pm.run();
    }
}
