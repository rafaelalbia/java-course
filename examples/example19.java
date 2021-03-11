import java.util.Scanner;

public class example19 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char answer;

        do {
            System.out.print("Temperature (Celsius): ");
            double temperature = input.nextInt();
            System.out.println("Converted to Fahrenheit: " + (temperature * 9 / 5 + 32));
            System.out.print("Do you want continue (Y/N)? ");
            answer = input.next().charAt(0);
        } while (answer == 'y');

        input.close();
    }
}
