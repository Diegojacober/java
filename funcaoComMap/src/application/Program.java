package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import utils.UpperCaseName;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        //Map so funciona para String
        // Implementação da interface
        //List<String> names = products.stream().map(new UpperCaseName()).collect(Collectors.toList());

        
        //Static
        // List<String> names = products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Non static
        // List<String> names = products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        
        //Lambda declarada

        // recebe product e retorna string
        /*
        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = products.stream().map(func).collect(Collectors.toList());
        */

        // Lambda inline
        List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
