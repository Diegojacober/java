package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Instructor;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List <Course> courses = new ArrayList<>();

        courses.add(new Course("Curso de java completo"));
        courses.add(new Course("Curso de php 8 completo 2023"));
        courses.add(new Course("Curso de Javascript completo 2023"));


        Instructor instrutor01 = new Instructor("Alex");
        
        for(Course c:courses) {
            instrutor01.addCourse(c);
        }

        for(int i = 0; i < courses.size(); i++) {
            System.out.println("How many students for " + courses.get(i).getName());
            int quantity = sc.nextInt();
            
            for(int j = 0; j < quantity; j++) {
                sc.nextLine();
                System.out.println("-----------------------------------");
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("code: ");
                int code = sc.nextInt();

                courses.get(i).addStudent(new Student(name, code));
            }
        }

        for(Course c:courses) {
            System.out.println(c.toString());
        }

        Set<Student> instructorStudents = instrutor01.getStudents();

        System.out.println("------------ALUNOS DO INSTRUTOR " + instrutor01.getName() + "------------");
        for (Student s:instructorStudents) {
            System.out.println(s.getName());
        }

        // cls;java '-cp' .\bin 'application.Program'

        sc.close();
    }
}
