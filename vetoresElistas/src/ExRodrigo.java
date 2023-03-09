import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExRodrigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        List<String> lista = new ArrayList<>();
        String nome = "";
        nomeCompleto = nomeCompleto + " ";
        for (int i = 0; i < nomeCompleto.length(); i++) {
            Character letra = nomeCompleto.charAt(i);
            nome = nome + letra;
            if (letra.equals(' ')) {
                lista.add(nome);
                nome = "";
            }
        }

        String primeiroNome = lista.get(0);
        for (int i = 0; i < primeiroNome.length(); i++) System.out.println(primeiroNome.charAt(i));

        lista.remove(0);
        for (String sobrenome:lista) System.out.print(sobrenome + " ");
    }
}
