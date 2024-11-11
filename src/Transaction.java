public class Transaction {
    private String product;
    private int quantity;
    private int unitPrice;

    public Transaction(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public double getTotalPrice(){
        return quantity * unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
