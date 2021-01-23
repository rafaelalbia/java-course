package lessons;

import java.util.Scanner;
import java.util.Locale;

public class example8 {
    
    public static void main(String[] Args) {

        // Example 8
        Locale.setDefault(Locale.FRANCE);
        Scanner input = new Scanner(System.in);

        double x;
        
        x = input.nextDouble();
        input.close();

        System.out.println(x);
        
    }
}
