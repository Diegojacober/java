package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print((i + 1) + "º" + " value: ");
            int value = sc.nextInt();
            ps.addvalue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
