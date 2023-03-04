import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0 ) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        System.exit(0);

    }
}
