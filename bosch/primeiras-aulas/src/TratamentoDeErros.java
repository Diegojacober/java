import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String numero;
        int num;

        while (true){
            try {
                System.out.print("Digite um número: ");
                numero = sc.nextLine().strip();
                num = Integer.parseInt(numero);

                if (num == (int) num) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Erro digite apenas números: " + e);
            }

        }

        sc.close();
        System.out.println("O número digitado foi "+num);
    }
}
