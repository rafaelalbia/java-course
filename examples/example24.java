import java.util.Locale;
import java.util.Scanner;

public class example24 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();


        System.out.println("Enter the measures of triangle Y: ");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", triangleArea(xA, xB, xC));
        System.out.printf("Triangle X area: %.4f%n", triangleArea(yA, yB, yC));
        System.out.printf("Larger area: %.4f%n", max(triangleArea(xA, xB, xC), triangleArea(yA, yB, yC)));

        input.close();
    }

    public static double triangleArea(double x, double y, double z) {
        double value;

        value = (x + y + z) / 2;
        value = Math.sqrt(value * (value - x) * (value - y) * (value - z));

        return value;
    }

    public static double max(double x, double y) {
        double value;

        if (x > y) {
            value = x;
        } else {
            value = y;
        }

        return value;
    }
}
