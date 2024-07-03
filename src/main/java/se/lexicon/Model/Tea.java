// Step 2: extend or implement Products:
package se.lexicon.Model;

 class tea extends Product {
    private String flavor;

    public tea(int id, double price, String productName, String flavor) {
        super(id,price,productName);
        this.flavor= flavor; // Setthe flavor
    }

    public String getflavor() {
        return flavor;
    }

    public void setflavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String examine() {
        return "A "  + flavor + getProductName();
    }

    @Override
    public String use() {
        return "A " + flavor +  getProductName();
    }
}