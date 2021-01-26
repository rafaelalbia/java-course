package exercises02;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("The number is NEGATIVE");
        } else {
            System.out.println("The number is not NEGATIVE");
        }
        input.close();
    }
}
