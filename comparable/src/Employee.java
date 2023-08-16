public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        //Por nome, em ordem alfabetica
//        return name.compareTo(other.getName());
        //Por salário em ordem crescecnte
//        return salary.compareTo(other.getSalary());
        //Por salário em ordem decrescente
        return -salary.compareTo(other.getSalary());
    }
}
