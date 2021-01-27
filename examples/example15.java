package examples;

import java.util.Scanner;

public class example15 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        double price = 34.5;
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.println(discount);
        
        input.close();
    }
}
