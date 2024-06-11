package demo.java.coffeeshop;

public class Product {

    private double price;
    private String name;
    private boolean beverage;
    private int quantityAvailable;

    // Constructors
    public Product(){

    }

    public Product(double price, String name, boolean beverage){
        this.price = price;
        this.name = name;
        this.beverage = beverage;
    }

    // Getters and Setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeverage() {
        return beverage;
    }

    public void setBeverage(boolean beverage) {
        this.beverage = beverage;
    }

    public int getQuantityAvailable() { return quantityAvailable; }

    public void setQuantityAvailable(int quantityAvailable) { this.quantityAvailable = quantityAvailable; }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", beverage=" + beverage +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}
