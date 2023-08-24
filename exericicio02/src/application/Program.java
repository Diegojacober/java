package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Course;
import entities.Instructor;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //List <Student> students = new ArrayList<>();

        // Course java = new Course("Curso de java completo");
        // Course php = new Course("Curso de php 8 completo 2023");
        // Course js =  new Course("Curso de Javascript completo 2023");

        

        /*Student student01 = new Student("Diego", 1);
        Student student02 = new Student("Nicole", 2);
        Student student03 = new Student("Angelo", 3);
        Student student04 = new Student("Bona", 4);*/

        List <Course> courses = new ArrayList<>();

        courses.add(new Course("Curso de java completo"));
        courses.add(new Course("Curso de php 8 completo 2023"));
        courses.add(new Course("Curso de Javascript completo 2023"));


        Instructor instrutor01 = new Instructor("Alex");

        for(int i = 0; i < courses.size(); i++) {
            System.out.println("How many students for " + courses.get(i).getName());
            int quantity = sc.nextInt();

            for(int j = 0; j <= quantity; j++) {
                System.out.println("Name: ");
                String name = sc.nextLine();

                System.out.println("code: ");
                int code = sc.nextInt();

                courses.get(i).addStudent(new Student(name, code));
            }
        }

       /* student01.addCourse(js);
        student01.addCourse(php);

        student02.addCourse(java);
        student02.addCourse(js);

        student03.addCourse(php);
        student03.addCourse(java);

        student04.addCourse(js);
        student04.addCourse(php);


        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);


        for (Student student : students) {
            System.out.println(student.toString());
        }*/

        sc.close();
    }
}
