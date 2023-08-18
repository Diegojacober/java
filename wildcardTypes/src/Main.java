import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Object> não é o supertipo de qualquer tipo de lista

        /*
        List<Object> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers; //Erro de compilação
        */

        //O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Diego Castan Lopes", "Diego Alencar Jacober", "Angelo", "Nicole", "Gabriel");
        printList(myStrs);
    }

    //Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo"
    public static void printList(List<?> list) {
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}