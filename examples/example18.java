import java.util.Scanner;

public class example18 {

    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      int number = input.nextInt();
      int sum = 0;

      for(int index = 0; index < number; index++) {
          sum += index;
          System.out.println(sum);
      }

      input.close();
    }

}