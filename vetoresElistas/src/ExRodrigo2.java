import java.util.Arrays;

public class ExRodrigo2 {
    public static void main(String[] args) {
        int[][] matriz = new int[11][11];

        //percorre as linhas
        for (int i=0; i < 11; i++) {
            //percorre as colunas
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }

        for (int i=0; i < 11; i++) {
            //percorre as colunas
            System.out.println("------------Tabuada do "+i+"------------");
            System.out.println("-------------------------------------");
            for (int j=0; j<matriz[i].length; j++) {
                System.out.println(i+" x "+j+" = "+matriz[i][j]);;
            }
            System.out.println("-------------------------------------");
        }

    }
}
