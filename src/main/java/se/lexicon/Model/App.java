// Step 4: implement methods
package se.lexicon.Model;

public class App {
    public static void main(String[] args) {
        // creating products
        Product[] products = {
                new tea(1, 10,"test","Lemon"),
                new coffee(2, 20,"coffee","Dark"),
                new Water(3, 30,"water","still")
        };

        // Create vending machine
        VendingMachine vendingMachine = new VMimplmnt();

        // Show available products
        System.out.println("The productts: Tea Water Coffee");
        for (String product : vendingMachine.getProducts()) {
            System.out.println(product);
        }

        // Add currency
        vendingMachine.addCurrency(5);
        System.out.println("The balance is: " + vendingMachine.getBalance());

        // Request a product
        Product requestedProduct = vendingMachine.request(products[0].getId());
        if (requestedProduct != null) {
            System.out.println("You chose: " + requestedProduct.examine());
        }

        // End session
        int returnedBalance = vendingMachine.endSession();
        System.out.println("Change: " + returnedBalance);
    }
}