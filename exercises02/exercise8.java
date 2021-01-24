package exercises02;

import java.util.Scanner;

public class exercise8 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        double salary, fee;

        System.out.print("Enter your salary: R$ ");
        salary = input.nextDouble();

        if (salary < 0) {
            System.out.println("Error");
        } else if (salary > 0.00 && salary <= 2000.00) {
            System.out.println("Free");
        } else if (salary <= 3000.00) {
            fee = 1000 * 0.08;
            System.out.printf("Fee: $ %.2f%n", fee);
        } else if (salary <= 4500.00) {
            fee = 1000 * 0.08 + (salary - 3000.00) * 0.18;
            System.out.printf("Fee: $ %.2f%n", fee);
        } else {
            fee = 1000 * 0.08 + 1500 * 0.18 + (salary - 4500.00) * 0.28;
            System.out.printf("Fee: $ %.2f%n", fee);
        }
        input.close();
    }
}
