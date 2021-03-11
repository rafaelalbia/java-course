import java.util.Scanner;

public class example20 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mask = 0b100000;
        int number = input.nextInt();

        if((number & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.err.println("6th bit is false!");
        }

        input.close();
    }
}
