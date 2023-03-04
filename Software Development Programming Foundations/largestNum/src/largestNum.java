import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = sc.nextInt();

        System.out.println("Please enter another number");
        int num2 = sc.nextInt();

        System.out.println("Please enter another number");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("The largest number is: " + num1);
        }
        else if (num2 > num3){
            System.out.println("The largest number is: " + num2);
        }
        else {
            System.out.println("The largest number is: " + num3);
        }

        System.exit(0);
    }
}
