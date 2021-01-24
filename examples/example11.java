package examples;

import java.util.Scanner;

public class example11 {
    
    public static void main(String[] Args) {

        // Example 11
        Scanner input = new Scanner(System.in);

        int x;
        String data1, data2, data3;

        x = input.nextInt();
        input.nextLine();
        data1 = input.nextLine();
        data2 = input.nextLine();
        data3 = input.nextLine();

        System.out.println("Data:");
        System.out.printf("%s%n%s%n%s%n%s%n", x, data1, data2, data3);
        input.close();

    }
    
}
