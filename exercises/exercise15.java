import java.util.Scanner;

public class exercise15 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int password = 2810;
        int choice = 0;

        while (choice != password) {
            System.out.print("Enter the password: ");
            choice = input.nextInt();
        }

        System.out.println("Login sucess!");

        input.close();
    }
}