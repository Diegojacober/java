package Exercicio03;

import Exercicio01.entities.enums.WorkerLevel;
import Exercicio03.entities.Client;
import Exercicio03.entities.Item;
import Exercicio03.entities.Order;
import Exercicio03.entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
        // sumário do pedido conforme o exemplo. Nota o instante do pedido deve o instante do sistema: new Date()
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date clientBirthDay = sdf.parse(sc.nextLine());

        Client client = new Client(clientName,clientEmail,clientBirthDay);

        System.out.println("Enter order Data: ");

        System.out.print("STATUS: ");
        String orderStatus = sc.nextLine();

        Date data = new Date();
        Order order = new Order(client,data, OrderStatus.valueOf(orderStatus));

        System.out.print("How many items to this order?");
        int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
           System.out.println("Enter #"+i+" item data: ");

           System.out.print("Product name: ");
           sc.nextLine();
           String productName = sc.nextLine();

           System.out.print("Product price: ");
           Double productPrice = sc.nextDouble();

           System.out.print("Quantity: ");
           int quantity = sc.nextInt();

           Product product = new Product(productName, productPrice);

           Item item = new Item(quantity, productPrice, product);

           order.addItem(item);
       }

        System.out.println(order.toString());
        sc.close();
    }

}
