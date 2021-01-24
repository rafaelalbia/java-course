package exercises;

import java.util.Scanner;

public class exercise6 {

    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);

        double A, B, C, pi, triangleArea, circleRadius, trapezoidArea, squareArea, rectangleArea;

        pi = 3.14159;
        System.out.print("A, B and C: ");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        triangleArea = (A * C) / 2;
        circleRadius = pi * Math.pow(C, 2);
        trapezoidArea =  C * (A + B) / 2;
        squareArea = Math.pow(B, 2);
        rectangleArea = A * B;

        System.out.printf("Triagngle area: %.3f%n", triangleArea);
        System.out.printf("Circle area: %.3f%n", circleRadius);
        System.out.printf("Trapezoid area: %.3f%n", trapezoidArea);
        System.out.printf("Square area: %.3f%n", squareArea);
        System.out.printf("Rectangle area: %.3f%n", rectangleArea);
        input.close();

    }
    
}
