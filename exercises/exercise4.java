package exercises;

import java.util.Scanner;

public class exercise4 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int ID;
        double hoursWorked, hourValue, salary;

        System.out.print("ID number: ");
        ID = input.nextInt();
        System.out.print("Hours worked: ");
        hoursWorked = input.nextDouble();
        System.out.print("Hour value: $ ");
        hourValue = input.nextDouble();
        input.close();
        salary = hoursWorked * hourValue;

        System.out.println("ID: " + ID);
        System.out.printf("Salary: $ %.2f%n", salary);

    }
    
}
