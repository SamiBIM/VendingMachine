// Step 2: extend or implement Products:
package se.lexicon.Model;

 class coffee extends Product {
    private String roast;

    public coffee(int id, double price, String productName, String roast) {
        super(id,price,productName);
        this.roast= roast; // Set the roast
    }

    public String getroast() {
        return roast;
    }

    public void setroast(String roast) {
        this.roast = roast;
    }

    @Override
    public String examine() {
        return "A "  + roast + getProductName();
    }

    @Override
    public String use() {
        return "A " + roast +  getProductName();
    }
}