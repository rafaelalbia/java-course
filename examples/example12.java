package examples;

import java.util.Scanner;

public class example12 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int hour;

        System.out.print("What time? ");
        hour = input.nextInt();
        
        if (hour < 12) {
            System.out.println("Good morning");
        } else {
            if (hour < 18) {
                System.out.println("Good afternoon");
            }
            else {
                System.out.println("Good night");
            }
        }
        
        input.close();
    }
}
