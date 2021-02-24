import java.util.Scanner;

public class exercise7 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.print("Enter a value (x and y): ");
        x = input.nextDouble();
        y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origin");
        }
        
        input.close();
    }
}
