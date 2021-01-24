package exercises02;

import java.util.Scanner;

public class exercise4 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int initialHour, finalHour, timeElapsed;

        System.out.print("Initial hour: ");
        initialHour = input.nextInt();
        System.out.print("Final hour: ");
        finalHour = input.nextInt();

        if (finalHour > initialHour) {
            timeElapsed = finalHour - initialHour;
        } else if (initialHour > finalHour) {
            timeElapsed = (24 - initialHour) + finalHour;
        } else {
            timeElapsed = 24;
        }

        System.out.printf("The game lasted %d hour(s)%n", timeElapsed);
        input.close();
    }
}
