package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import entities.Product;

public class Program {
    /*
     * • É uma coleção de pares chave / valor
     * • Não admite repetições do objeto chave
     * • Os elementos são indexados pelo objeto chave (não possuem posição)
     * • Acesso, inserção e remoção de elementos são rápidos
     * • Uso comum: cookies, local storage, qualquer modelo chave-valor
     * • Principais implementações:
     * • HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
     * • TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
     * pelo
     * compareTo do objeto (ou Comparator)
     * • LinkedHashMap - velocidade intermediária e elementos na ordem em que são
     * adicionados
     * 
     * 
     * Alguns métodos importantes
     * • put(key, value), remove(key), containsKey(key), get(key)
     * • Baseado em equals e hashCode
     * • Se equals e hashCode não existir, é usada comparação de ponteiros
     * • clear()
     * • size()
     * • keySet() - retorna um Set<K>
     * • values() - retornaa um Collection<V>
     */

    public static void main(String[] args) {
        /*
         * Map<String, String> cookies = new TreeMap<>();
         * 
         * cookies.put("username", "Diego");
         * cookies.put("email", "diego@gmail.com");
         * cookies.put("phone", "123456789");
         * 
         * 
         * System.out.println(cookies.containsKey("email"));
         * 
         * cookies.remove("email");
         * 
         * System.out.println("ALL COOKIES");
         * for (String key: cookies.keySet()) {
         * System.out.println(key + ": " + cookies.get(key));
         * }
         * 
         */

         /*
        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

        */

        //Exercicio map

        String path = "C:\\temp\\a.csv";
        
          try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map <String, Integer> map = new HashMap<>();

            String line = br.readLine();
            while (line != null) {

                String[] data = line.split(",");
                
                String name = data[0];


                if (map.containsKey(name)) {
                    map.put(name, ( map.get(name) + Integer.parseInt(data[1])));
                } else {
                    map.put(name, Integer.parseInt(data[1]));
                }
                line = br.readLine();

            }

            for(String name: map.keySet()) {
                System.out.println("Votos em " + name + ": " + map.get(name));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

}