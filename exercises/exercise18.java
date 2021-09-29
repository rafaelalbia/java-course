import java.util.Scanner;

public class exercise18 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for(int index = 0; index < number; index++) {
            if(index % 2 == 1) {
                System.out.println(index);
            }
        }
        
        input.close();
    }
}
