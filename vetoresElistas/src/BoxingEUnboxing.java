public class BoxingEUnboxing {
    public static void main(String[] args) {
         int x = 20;
         Object obj = x;
         System.out.println(obj);

         int y = (int) obj;

         //wrapper trata os tipos primitivos como classes de forma transparente ao compilador
        Integer obj1 = x;
        int z = obj1 * 2;
        System.out.println(z);
    }
}
