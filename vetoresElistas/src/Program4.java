import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você deseja inserir? ");
        int n = sc.nextInt();
        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length;i++) {
            System.out.println("Digite o nome: ");
            String nome = sc.next();

            System.out.println("Digite a altura de "+nome);
            Double altura = sc.nextDouble();

            System.out.println("Digite a idade de "+nome);
            int idade = sc.nextInt();
            vect[i] = new Person(nome,altura,idade);
        }

        double menoresDe16 = 0;
        for (int i = 0; i < vect.length; i++) {
            int idade = vect[i].getIdade();
            if (idade < 16) {
                menoresDe16 ++;
            }
        }

        double porcentagem = (menoresDe16 / vect.length) * 100;
        System.out.printf("A porcentagem de menores de 16 anos é %.2f%%",porcentagem);
        sc.close();
    }
}
