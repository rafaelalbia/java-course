package examples;

import java.util.Scanner;

public class example13 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String result;

        switch (x) {
        case 1:
            result = "Sunday";
            break;
        case 2:
            result = "Monday";
            break;
        case 3:
            result = "Tuesday";
            break;
        case 4:
            result = "Wednesday";
            break;
        case 5:
            result = "Thursday";
            break;
        case 6:
            result = "Friday";
            break;
        case 7:
            result = "Saturday";
            break;
        default:
            result = "Invalid";
            break;
        }

        System.out.printf("Day: %s%n", result);
        input.close();
    }
    
}
