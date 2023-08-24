package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        // Representa um conjunto de elementos (similar ao da Álgebra)
        // • Não admite repetições
        // • Elementos não possuem posição
        // • Acesso, inserção e remoção de elementos são rápidos
        // • Oferece operações eficientes de conjunto: interseção, união, diferença.
        // • Principais implementações:
        // • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
        // • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
        // pelo
        // compareTo do objeto (ou Comparator)
        // • LinkedHashSet - velocidade intermediária e elementos na ordem em que são
        // adicionados

        // Set<String> set = new HashSet<>();
        // Set<String> set = new LinkedHashSet<>();

        // set.add("TV");
        // set.add("Notebook");
        // set.add("Tablet");

        // System.out.println(set.contains("Notebook"));

        // set.remove("Tablet");
        // set.removeIf(x -> x.length() >= 3);
        // set.removeIf(x -> x.cahrAt(0) == 'T');
        


        // for (String p : set) {
        //     System.out.println(p);
        // }


        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union - juntar
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection -> elementos em comum
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference -> remover elementos diferentes
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
