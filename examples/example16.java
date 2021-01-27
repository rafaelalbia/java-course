package examples;

import java.util.Scanner;

public class example16 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        double width = input.nextDouble();
        double length = input.nextDouble();
        double squareMeters = input.nextDouble();

        double area = width * length;
        double price = area * squareMeters;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Price: %.2f%n", price);
        
        input.close();
    }
}
