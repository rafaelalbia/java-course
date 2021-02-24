public class exercise3 {

    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);

        int A, B, C, D, difference;

        System.out.print("Value of A: ");
        A = input.nextInt();
        System.out.print("Value of B: ");
        B = input.nextInt();
        System.out.print("Value of C: ");
        C = input.nextInt();
        System.out.print("Value of D: ");
        D = input.nextInt();
        difference = (A * B - C * D);

        System.out.println("The difference is equal " + difference);
        
        input.close();
    }
}