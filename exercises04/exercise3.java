import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int amount = input.nextInt();

        for(int firstIndex = 0; firstIndex != amount; firstIndex++) {
            System.out.print("Type three float values: ");
            float firstNumber = 2 * input.nextFloat();
            float secondNumber = 3 * input.nextFloat();
            float thirdNumber = 5 * input.nextFloat();
            float average = (firstNumber + secondNumber + thirdNumber) / 10;
            System.out.printf("Average: %.1f\n", average);
        }

        input.close();
    }
}
