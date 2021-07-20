import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class example25 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();


        System.out.println("Enter the measures of triangle Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", triangleArea(x.a, x.b, x.c));
        System.out.printf("Triangle Y area: %.4f%n", triangleArea(y.a, y.b, y.c));
        System.out.printf("Larger area: %s%n", max(triangleArea(x.a, x.b, x.c), triangleArea(y.a, y.b, y.c)));

        input.close();
    }

    public static double triangleArea(double x, double y, double z) {
        double value;

        value = (x + y + z) / 2;
        value = Math.sqrt(value * (value - x) * (value - y) * (value - z));

        return value;
    }

    public static String max(double x, double y) {
        if (x > y) {
            return "X";
        } else {
            return "Y";
        }
    }
}
