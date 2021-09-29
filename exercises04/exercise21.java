import java.util.Scanner;

public class exercise21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        for(int index = 0; index != amount; index++) {
            int denominator = input.nextInt();
            int numerator = input.nextInt();
            if(denominator != 0) {
                System.out.printf("Average: ", denominator / numerator);
            } else {
                System.out.println("Impossible division!");
            }
        }

        input.close();
    }
}
