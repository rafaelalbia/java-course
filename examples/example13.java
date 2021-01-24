package examples;

import java.util.Scanner;

public class example13 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int minutes = input.nextInt();

        double fee = 50.0;
        if (minutes > 100) {
            fee += (minutes - 100) * 2.0;
        }

        System.out.printf("Total value: $ %.2f%n", fee);
        input.close();
    }
    
}
