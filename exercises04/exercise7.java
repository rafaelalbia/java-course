import java.util.Scanner;

public class exercise7 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int index = 1; index != number + 1; index++) {
            System.out.printf("%d %d %d\n",index, index * index, index * index * index);
        }

        input.close();
    }
}
