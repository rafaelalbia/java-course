package exercises01;

import java.util.Scanner;

public class exercise5 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int order, amount;
        double unitaryValue, totalValue;

        System.out.print("Order, amount and unitary value (first product): ");
        order = input.nextInt();
        amount = input.nextInt();
        unitaryValue = input.nextDouble();

        totalValue = amount * unitaryValue;

        System.out.print("Order, amount and unitary value (second product): ");
        order = input.nextInt();
        amount = input.nextInt();
        unitaryValue = input.nextDouble();

        totalValue += amount * unitaryValue;

        System.out.printf("Total value: $ %.2f%n", totalValue);
        input.close();
    }
}
