import java.util.Scanner;

public class exercise19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int amount = input.nextInt();
        int inSum = 0;
        int outSum = 0;
        int number;

        for(int index = 0; index != amount; index++) {
            number = input.nextInt();
            if(number >= 10 && number <= 20) {
                inSum += 1;
            } else {
                outSum += 1;
            }
        }

        System.out.printf("%d in\n%d out\n", inSum, outSum);

        input.close();
    }
}