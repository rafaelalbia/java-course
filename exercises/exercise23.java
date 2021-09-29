import java.util.Scanner;

public class exercise23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Divisors: ");
        for(int index = number; index != 0; index--) {
            if(number % index == 0) {
                System.out.println(index);
            }
        }

        input.close();
    }
}
