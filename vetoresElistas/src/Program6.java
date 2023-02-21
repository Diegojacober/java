import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionários irão ser registrados? ");
        int n = sc.nextInt();
        List <Funcionario> funcionarios = new ArrayList();

        for (int i = 0; i < n; i++) {
            System.out.println("# Funcionário "+(i +1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(funcionarios,id)) {
                System.out.println("Esse id já existe, tente novamente");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.printf("Salário: R$ ");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(nome,salario,id);

            funcionarios.add(funcionario);
        }

        System.out.println();
        System.out.println("Digite o id do funcionário que deseja aumentar o salário: ");
        int idSalario = sc.nextInt();

        //Integer posicao = position(funcionarios,idSalario);
        Funcionario fun = funcionarios.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
        if (fun == null) {
            System.out.println("O id digitado não existe");
        } else {
            System.out.println("Digite a porcentagem que deseja aumentar: ");
            double porcentagem = sc.nextDouble();
            fun.aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario: funcionarios) {
            System.out.println(funcionario);
        }


        sc.close();
    }
    public static Integer position(List<Funcionario> lista,int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == i) {
                return i;
            }
        }
        return null;
    }

    public  static boolean hasId(List<Funcionario> list, int id) {
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }
}
