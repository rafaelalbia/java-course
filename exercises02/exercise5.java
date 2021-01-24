package exercises02;

import java.util.Scanner;

public class exercise5 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int choice, amount;
		double totalValue;
        String[] product = {"Hot-Dog", "X-Salad", "X-Bacon", "Simple toast", "Soda"};
        double[] price = {4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.print("Enter your choice (product and amount): ");
        choice = input.nextInt() - 1;
        amount = input.nextInt();
        totalValue = price[choice] * amount;
        
        System.out.printf("Total value: $ %.2f%n", totalValue);
    }
}
