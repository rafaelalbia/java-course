import java.util.Scanner;
import entities.exercise25.Rectangle;

public class exercise25 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle firstRectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        firstRectangle.width = input.nextDouble();
        firstRectangle.height = input.nextDouble();

        System.out.println("AREA = " + firstRectangle.Area());
        System.out.println("PERIMETER = " + firstRectangle.Perimeter());
        System.out.println("DIAGONAL = " + firstRectangle.Diagonal());

        input.close();
    }
}
