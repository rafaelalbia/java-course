import java.util.Scanner;

public class exercise17 {
    
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the product type (1. Alcohol | 2. Gasoline | 3. Diesel): ");
        int productType = input.nextInt();
        int alcohol = 0;
        int gasoline = 0; 
        int diesel = 0;
        
        while (productType != 4) {
            if (productType == 1) {
                alcohol += 1;
            } else if (productType == 2) {
                gasoline += 1;
            } else if (productType == 3) {
                diesel += 1;
            } else {
                System.out.println("Sorry, wrong number!");
            }
            System.out.print("Enter the product type (1. Alcohol | 2. Gasoline | 3. Diesel): ");
            productType = input.nextInt();
        }

        System.out.println("\nTHANK YOU!");
        System.out.printf("Alcohol: %d%n", alcohol);
        System.out.printf("Gasoline: %d%n", gasoline);
        System.out.printf("Diesel: %d%n", diesel);

        input.close();
    }
}
