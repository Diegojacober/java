package Exercicio03.entities;

import Exercicio02.entities.Comment;
import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<Item> itens = new ArrayList<>();

    public Order(Client client,Date moment, OrderStatus status) {
        this.moment = moment;
        this.client = client;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public void removeItem(Item item) {
        this.itens.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (Item i:this.itens) {
            total += i.getPrice() * i.getQuantity();
        }
        return total;
    }

    public String toString() {
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY \n");
        sb.append("Order Moment: "+sdf.format(this.moment)+"\n");
        sb.append("Order status: "+this.status);
        sb.append("Client: "+this.client.getName()+" ("+sdf2.format(this.client.getBirthDate())+") -");
        sb.append(" "+this.client.getEmail()+"\n");
        sb.append("ORDER ITEMS: \n");

        for (Item item:itens) {
            String nome = item.getProduct().getName();
            sb.append(nome+", $"+String.format("%.2f",item.getPrice())+
                    ", Quantity: "+item.getQuantity()+
                    ", Subtotal: $"+String.format("%.2f",item.subTotal())+"\n");
        }

        sb.append("Total price: $"+String.format("%.2f", this.total()));

        return sb.toString();
    }
}
