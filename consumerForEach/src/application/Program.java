package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import utils.PriceUpdate;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));


        //products.forEach(new PriceUpdate());


        //Static
        // products.forEach(Product::staticPriceUpdate);

        //Non static
        // products.forEach(Product::nonStaticPriceUpdate);

        // lambda declarada
        /*double factor = 1.1;
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        products.forEach(cons);
        */

        //lambda inline
        double factor = 1.1;
        products.forEach(p -> p.setPrice(p.getPrice() * factor));

        products.forEach(System.out::println);
    }
}
