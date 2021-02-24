import java.util.Scanner;

public class exercise2 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.print("type a value (X and Y): ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("First");
            } else if (x < 0 && y > 0) {
                System.out.println("Second");
            } else if (x < 0 && y < 0) {
                System.out.println("Third");
            } else if (x > 0 && y < 0) {
                System.out.println("Fourty");
            }
        }

        input.close();
    }
}
