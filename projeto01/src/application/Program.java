package application;

import domain.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Roberto Miranda", "roberto@gmail.com");
        Pessoa p2 = new Pessoa(2, "Joao Pereira", "joao@gmail.com");
        Pessoa p3 = new Pessoa(3, "Pedro Marcelo", "pedro@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
