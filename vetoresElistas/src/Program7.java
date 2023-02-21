import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int l = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

//        System.out.println("Digite a linha e a coluna separados por virgula");
//        String p = sc.next();
//        String[] posicoes = p.split(",");
//        int linha = Integer.parseInt(posicoes[0]);
//        int coluna = Integer.parseInt(posicoes[1]);
//        int numero = matriz[linha][coluna];

        System.out.println("Digite um número que esta matriz");
        int numero = sc.nextInt();

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Em cima: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Em baixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
