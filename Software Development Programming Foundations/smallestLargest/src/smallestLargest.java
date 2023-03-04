import java.util.Scanner;

public class smallestLargest {
    public static void main(String[] args) throws Exception {
        int largest = 0, smallest = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if (a > b) {
            largest = a;
            smallest = b;
        }
        else {
            largest = b;
            smallest = a;
        }

        System.out.printf("The numbers in ascending order are %d %d", smallest, largest);
    }
}
