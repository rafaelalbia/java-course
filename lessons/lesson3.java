import java.util.Scanner;
import entities.Product;

public class lesson3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);        
        Product firstProduct = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        firstProduct.name = input.nextLine();

        System.out.print("Price: ");
        firstProduct.price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        firstProduct.quantity = input.nextInt();

        firstProduct.productData();

        input.close();
        
    }

}
