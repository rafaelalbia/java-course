package examples;

import java.util.Scanner;


public class example17 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type a number (0 close program): ");
        int number = input.nextInt();
        int sum = number;

        while (number != 0) {
            System.out.print("Type a number (0 close program): ");
            number = input.nextInt();
            sum += number;
        }

        System.out.printf("Total sum: %d%n", sum);

        input.close();
    }
}
