package entities;

public class Funcionario {
    private String nome;
    private Double salario;
    private Integer id;

    public Funcionario(String nome,Double salario,Integer id) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void aumentarSalario(double percentage) {
        salario += salario + (salario * percentage / 100);
    }

    public String toString() {
        return id + ", "+nome+" ,"+ String.format("%.2f",salario);
    }

}
