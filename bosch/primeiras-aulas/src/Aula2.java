import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        String palavra;
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite uma palavra: ");
//        palavra = entrada.nextLine();
//        System.out.printf("A palavra que você digitou foi %s",palavra);

        String nome, sobrenome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();
        System.out.println("Digite quantos anos você tem");
        idade = entrada.nextInt();
        System.out.printf("Seu nome é %s %s e você tem %d anos",nome,sobrenome,idade);
    }
}
