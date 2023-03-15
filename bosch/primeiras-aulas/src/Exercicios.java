import entities.Matematica;
import entities.Pessoa;
import entities.Temperatura;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n Digite o numero de qual operação deseja: \n 1 - Converter Graus Celsius para Fahnhreit \n 2 - Converter Graus Fahnreit para Celsius" +
                    "3 - Ver IMC \n 4 - Valor ao cubo e ao quadrado \n 5 - Area do Triângulo \n 6 - Valor de delta \n\nDigite o número da sua opção: ");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o grau em Celsius: ");
                    double grausC = sc.nextDouble();
                    System.out.println("A temperatura em graus Fahrenheit é "+exercicio1(grausC));
                    break;
                case 2:
                    System.out.println("Digite o grau em Fahrenheit: ");
                    double grausF = sc.nextDouble();
                    System.out.printf("A temperatura em graus Celsius é %.2f \n",exercicio2(grausF));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a altura da pessoa: ");
                    double altura = sc.nextDouble();
                    System.out.println("Digite o peso da pessoa: ");
                    double peso = sc.nextDouble();
                    System.out.printf("%s tem o imc de %.2f",nome,exercicio3(nome,altura,peso));
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja ver ao cubo e ao quadrado: ");
                    double valor = sc.nextDouble();
                    System.out.printf("Valor ao quadrado: %.2f --- Valor ao cubo: %.2f", Matematica.valorAoQuadrado(valor),Matematica.valorAoCubo(valor));
                    break;
                case 5:
                    System.out.println("Digite a base do triangulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Digite a altura do triangulo: ");
                    double alturaT = sc.nextDouble();
                    System.out.printf("A area do triangulo é %.2f",Matematica.areaDoTriangulo(base,alturaT));
                    break;
                case 6:
                    System.out.println("Digite o valor de A: ");
                    double a = sc.nextDouble();
                    System.out.println("Digite o valor de B: ");
                    double b = sc.nextDouble();
                    System.out.println("Digite o valor de C: ");
                    double c = sc.nextDouble();
                    System.out.printf("O delta vale  %.2f",Matematica.delta(a,b,c));
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida");
                    break;
            }
        }


    }

    public static double exercicio1(double graus) {
        Temperatura temp = new Temperatura(graus);
        temp.converterCel(graus);
        return temp.getFahrenhrit();
    }

    public static double exercicio2(double graus) {
        Temperatura temp = new Temperatura(graus);
        temp.converterFah(graus);
        return temp.getCelsius();
    }

    public static double exercicio3(String nome,double altura, double peso) {
        Pessoa pes = new Pessoa(nome,altura,peso);
        return pes.imc();
    }

}
