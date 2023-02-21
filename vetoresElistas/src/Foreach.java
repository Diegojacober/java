public class Foreach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria","João","Pedro"};

        //for
        for (int i = 0; i < vect.length;i++) {
            System.out.println(vect[i]);
        }

        //foreach
        for (String palavra : vect) {
            System.out.println(palavra);
        }
    }
}
