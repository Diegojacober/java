import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        //Lista x = new List(); -> não dá porque é interface, é nccessário uma classe que implementa essa classe

        // Vantagens: tamanho variável, facilidade para realizar inserções e deleções.
        // Desvantagens: o acesso é sequencial.

        //<parametrizando que quero uma lista de inteiros
        List<String> lista = new ArrayList();

        lista.add("Maria");
        lista.add("Joao");
        lista.add("Pedro");
        lista.add(1 , "Ana");
        lista.add(2,"Marco");

        System.out.println(lista.size());

        lista.remove("Marco");
        lista.remove(1);

        for (String item : lista) {
            System.out.println(item);
        }

        //remove todo mundo que começa com M
        lista.removeIf(x -> x.charAt(0) == 'M');

        // deixa só quem começa com P
        List <String> result = lista.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
        for (String item : result) {
            System.out.println(item);
        }

        // encontrar a posição de um elemento. Retorna a posição do item, se não encontrar retorna -1
        System.out.println("Index of joao: "+ lista.indexOf("Joao"));

        // encontrar primeiro elemento que começa com a letra J
        String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
