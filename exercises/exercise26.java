import java.util.Scanner;
import entities.exercise26.Employee;

public class exercise26 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Employee firstEmployee = new Employee();
        
        System.out.print("Name: ");
        firstEmployee.name = input.next();
        System.out.println("Gross salary: ");
        firstEmployee.salary = input.nextDouble();

        System.out.println("Employee: " + firstEmployee);

        input.close();
    }
}
