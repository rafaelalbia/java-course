import java.util.Scanner;

public class example22 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
