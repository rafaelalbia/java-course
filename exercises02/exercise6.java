import java.util.Scanner;

public class exercise6 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        double number;

        System.out.print("Enter a number: ");
        number = input.nextDouble();
        
        if (number < 0 || number > 100) {
            System.out.println("Our of interval");
        } else if (number >= 0 && number <= 25) {
            System.out.println("Interval (0, 25)");
        } else if (number <= 50) {
            System.out.println("Interval (25, 50)");
        } else if (number <= 75) {
            System.out.println("Interval (50, 75)");
        } else {
            System.out.println("Interval (75, 100)");
        }
        
        input.close();
    }
}
