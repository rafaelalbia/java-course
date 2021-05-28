import java.util.Scanner;

public class example23 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        showResult(max(a, b, c));

        // if (a > b && a > c) {
        //     System.out.println("Higher = " + a);
        // } else if (b > c) {
        //     System.out.println("Higher = " + b);
        // } else {
        //     System.out.println("Higher = " + c);
        // }

        input.close();
    }

    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
