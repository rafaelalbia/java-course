package lessons;

import java.util.Scanner;

public class example9 {
    
    public static void main(String[] Args) {
        // Example 9
        Scanner input = new Scanner(System.in);

        char x;

        x = input.next().charAt(0);
        input.close();

        System.out.println(x);
    }
}
