package se.lexicon.Model;

// Step 3: Create interface and implement class

public interface VendingMachine {
    void addCurrency(int amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String  getDescription(int id);
    String[] getProducts();
}