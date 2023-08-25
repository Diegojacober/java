package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import utils.ProductPredicate;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));


        

        // Com predicate
        //products.removeIf(new ProductPredicate()); 
        
        // products.removeIf(Product::staticProductPredicate);


        // products.removeIf(Product::nonProductPredicate);

        /* lambda inline
        double min = 100.0;
        Predicate<Product> pred = p -> p.getPrice() >= min;
        products.removeIf(pred);
        */


        // products.removeIf(x -> x.getPrice() > 100); -> lambda inline

        for (Product p: products) {
            System.out.println(p);
        }
    }
}
