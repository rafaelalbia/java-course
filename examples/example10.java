package examples;

import java.util.Scanner;

public class example10 {

    public static void main(String[] Args) {

        // Example 10
        Scanner input = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = input.next();
        y = input.nextInt();
        z = input.nextDouble();

        System.out.printf("Data: %s %d %.2f%n", x, y, z);
        input.close();

    }
    
}
