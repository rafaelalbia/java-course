package exercises;

import java.util.Scanner;

public class exercise2 {
    
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);

        double radius, pi, area;

        System.out.print("Radius value: ");
        radius = input.nextDouble();
        input.close();
        pi = 3.14159;
        area = pi * Math.pow(radius, 2);

        System.out.printf("The area is equal %.4f%n", area);

    }

}
