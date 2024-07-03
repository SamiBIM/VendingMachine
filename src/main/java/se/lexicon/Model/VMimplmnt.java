// Step 3: Create interface and implement class
package se.lexicon.Model;


import java.util.ArrayList;
import java.util.List;

public class VMimplmnt implements VendingMachine {
    private List<Product> products;
    private int depositPool;

    public VMimplmnt() {
        this.products = new ArrayList<>();
        this.depositPool = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void addCurrency(int amount) {
        // Only accepts specific values
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 || amount == 50 ||
                amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            this.depositPool += amount;
        } else {
            System.out.println("Invalid amount. Please enter a valid amount.");
        }
    }

    @Override
    public int getBalance() {
        return this.depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId()==(id)) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    return product;
                } else {
                    System.out.println("Insufficient funds.");
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId()==(id)) {
                return product.examine();
            }
        }
        return "Product not found.";
    }

    @Override
    public String[] getProducts() {
        String[] productStrings = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productStrings[i] = "ID: " + product.getId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice();
        }
        return productStrings;
    }
}



