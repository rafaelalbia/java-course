package exercises;

import java.util.Scanner;

public class exercise1 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int firstValue, secondValue, resultSum;

        System.out.print("First value: ");
        firstValue = input.nextInt();
        System.out.print("Second value: ");
        secondValue = input.nextInt();
        input.close();
        resultSum = firstValue + secondValue;

        System.out.println("The result of sum is " + resultSum);

    }

}
