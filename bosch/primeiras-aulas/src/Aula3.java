public class Aula3 {
    public static void main(String[] args) {
        var a = 10;
        System.out.println(a);

        var b = 3.14;
        System.out.println(b);

        var c = 'x';
        System.out.println(c);

        var d = false;
        System.out.println(d);

        var e = "Bosch";
        System.out.println(e);

        // Transforma a variavel em classe e pega o nome dela
        var s = ((Object)a).getClass().getSimpleName();
        System.out.printf("A variável tem o valor %d e ela é do tipo %s",a,s);
    }
}
