package demo.java.coffeeshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeShop {
    List<Product> products = new ArrayList<>();

    public void initProducts(){
        Product coffee = new Product();
        coffee.setPrice(5.46);
        coffee.setName("Large Coffee");
        coffee.setBeverage(true);

        products.add(coffee);

        Product cakePop = new Product();
        cakePop.setPrice(3.89);
        cakePop.setName("Cake Pop");
        cakePop.setBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product(7.89, "Egg Sandwich", false);
        products.add(eggSandwich);

        ProductReader pr = new ProductReader();
        List<Product> productsFromFile = pr.readProducts();
        products.addAll(productsFromFile);
    }

    public void printCheapProducts(){
        List<Product> cheapProducts =   products.stream()
                                            .filter(product -> product.getPrice() < 5)
                                            .collect(Collectors.toList());

        cheapProducts.forEach(product -> System.out.println(product.getName() + "\t" + product.getPrice()));
    }
    public void printProducts() {
        for (int pos = 0; pos < products.size(); pos++) {
            Product product = products.get(pos);
            System.out.println(pos + ") " + product.getName() + "\t" + product.getPrice() );
        }
    }

}
