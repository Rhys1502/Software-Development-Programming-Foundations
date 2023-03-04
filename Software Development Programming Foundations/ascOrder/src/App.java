import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int largest = 0, smallest = 0, middle = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            largest = a;
        }
        if (b > a && b > c) {
            largest = b;
        }
        if (c > a && c > b) {
            largest = c;
        }


        if (a < b && a < c) {
            smallest = a;
        }
        if (b < a && b < c) {
            smallest = b;
        }
        if (c < a && c < b) {
            smallest = c;
        }

        middle = (a + b + c) - (largest + smallest);
        System.out.printf("Ascending order %d %d %d", smallest, middle, largest);
    }
}
