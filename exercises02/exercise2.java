package exercises02;

import java.util.Scanner;

public class exercise2 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }
}
