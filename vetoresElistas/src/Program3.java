import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double[] negativos = new double[n];

        if (vect.length > 10) {
            System.out.print("Você deve digitar no maximo 10 números");
        } else {
            for (int i = 0; i < vect.length;i++) {
                System.out.print("Digite o número: ");
                Double numero = sc.nextDouble();
                if (numero < 0) {
                    negativos[i] = numero;
                }
            }
            System.out.print("Números negativos: \n");
            for (int i = 0; i < negativos.length; i++) {
                if (negativos[i] < 0) {
                    System.out.print(negativos[i]+"\n");
                }
            }
        }

        sc.close();
    }
}
