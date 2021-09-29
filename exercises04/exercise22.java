import java.util.Scanner;

public class exercise22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: !");
        int number = input.nextInt();
        int result = number;

        for(int index = number - 1; index != 0; index--) {
            result *= index;
        }

        System.out.printf("!%d = %d\n", number, result);

        input.close();
    }
}
