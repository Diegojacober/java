import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos quartos irá cadastrar");
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for (int i = 0; i < student.length; i++) {
            System.out.println("Type the student name: ");
            String name = sc.next();
            System.out.println("Type the student e-mail");
            String email = sc.next();
            System.out.printf("Type room choosed for %n",name);
            int room = sc.nextInt();
            student[i] = new Student(name,email,room);
        }

        System.out.println("Busy Rooms: ");
        for (int i = 0; i < student.length; i++) {
            System.out.printf(student[i].getRoom()+ " - " + student[i].getName() +" " + student[i].getEmail());
        }

        sc.close();
    }
}
