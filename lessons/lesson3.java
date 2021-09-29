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
        
        System.out.println();

        System.out.println("Product Data: " + firstProduct);

        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        firstProduct.addProduct(input.nextInt());

        System.out.println();

        System.out.println("Updated Data: " + firstProduct);

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        firstProduct.removeProducts(input.nextInt());

        System.out.println();

        System.out.println("Updated Data: " + firstProduct);

        input.close();
        
    }

}
