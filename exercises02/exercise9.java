import java.util.Scanner;

public class exercise9 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int A, B;

        System.out.print("A and B: ");
        A = input.nextInt();
        B = input.nextInt();

        if (A > B && A % B == 0 || B > A && B % A == 0) {
            System.out.println("They are multiple");
        } else {
            System.out.println("They are not multiple");
        }
        
        input.close();
    }
}
