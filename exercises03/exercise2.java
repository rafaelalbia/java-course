package exercises03;

import java.util.Scanner;

public class exercise2 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int x, y = 1;

        while (x != 0 || y != 0) {
            System.out.print("X: ");
            x = input.nextInt();
            System.out.print("Y: ");
            y = input.nextInt();
        }

        input.close();
    }
}
