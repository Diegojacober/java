package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String name;
    private Set<Student> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Alunos cadastrados em " + this.getName() + "\n");


        for(Student s: students) {
            sb.append("-------------------------" + "\n");
            sb.append("Nome: " + s.getName() + "\n");
            sb.append("Código: " + s.getCode() + "\n");
            sb.append("-------------------------" + "\n");
        }

        sb.append("Total de alunos nesse curso: " + students.size() + "\n");
        sb.append("=====================================");

        return sb.toString();
    }
}
