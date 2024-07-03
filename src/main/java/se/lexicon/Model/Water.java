// Step 2: extend or implement Products:
package se.lexicon.Model;

public class Water extends Product {
    private String type;

    public Water(int id, double price, String productName, String type) {
        super(id,price,productName);
        this.type= type; // Set type
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String examine() {
        return "A "  + type + getProductName();
    }

    @Override
    public String use() {
        return "A " + type +  getProductName();
    }
}