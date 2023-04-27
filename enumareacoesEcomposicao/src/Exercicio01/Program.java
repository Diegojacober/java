package Exercicio01;

import Exercicio01.entities.Department;
import Exercicio01.entities.HourContract;
import Exercicio01.entities.Worker;
import Exercicio01.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter departmentes name: ");
        String departmentsName = sc.nextLine();

        System.out.println("Enter Worker data: ");

        System.out.println("Name: ");
        String workerName = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary: ");
        double workerBaseSalary = sc.nextDouble();

        Department dep = new Department(departmentsName);
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, dep);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            System.out.print("Enter contract #"+i+" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        sc.close();
    }
}
