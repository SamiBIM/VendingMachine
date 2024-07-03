package se.lexicon.Model;
import java.util.UUID;

// Step 1: Create Product (Option 1: Abstract class Product)

public abstract class Product {
    private int id;
    private double price;
    private String productName;

    public Product(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public abstract String examine();
    public abstract String use();
}