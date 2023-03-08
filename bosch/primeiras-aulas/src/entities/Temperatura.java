package entities;

public class Temperatura {
    private double celsius;
    private double fahrenhrit;

    public Temperatura(double graus){
        this.fahrenhrit = graus;
    }

    public void converterCel(double graus) {
        double fahrenhrit = (graus * 1.8) + 32;
        setFahrenhrit(fahrenhrit);
    }

    public void converterFah(double graus) {
        double celsius = (graus - 32) / 1.8;
        setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenhrit() {
        return fahrenhrit;
    }

    public void setFahrenhrit(double fahrenhrit) {
        this.fahrenhrit = fahrenhrit;
    }
}
