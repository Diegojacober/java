import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o nome do produto %n",i);
            String name = sc.next();
            System.out.printf("Digite o preço do produto %n",i);
            Double price = sc.nextDouble();
            System.out.printf("Digite a quantidade de produtos %n",i);
            int quantity = sc.nextInt();
            vect[i] = new Product(name,price,quantity);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Preço medio: %.2f%n",avg);

        sc.close();
    }
}
