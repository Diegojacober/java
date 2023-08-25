package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(products, p -> p.getName().charAt(0) == 'M');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
