package entities;

public class Matematica {
    public static double valorAoQuadrado(double valor) {
        return Math.pow(valor,2);
    }

    public static double valorAoCubo(double valor) {
        return Math.pow(valor,3);
    }

    public static double areaDoTriangulo(double base,double altura) {
        return base * (altura/2);
    }

    public static double delta(double aa,double b,double c) {
        return Math.pow(b,2) - (4 * aa * c);
    }
}
