package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle Y: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double px = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(px * (px - xA) * (px - xB) * (px - xC));

        double pz = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pz * (pz - yA) * (pz - yB) * (pz - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area X");
        } else {
            System.out.println("Large area Y");
        }
    }
}
