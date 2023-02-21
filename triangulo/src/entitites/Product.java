package entitites;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int  quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Name: "+this.name+"\nPrice $"+String.format("%.2f",this.price)+"\nQuantity: "+this.quantity;
    }

}
