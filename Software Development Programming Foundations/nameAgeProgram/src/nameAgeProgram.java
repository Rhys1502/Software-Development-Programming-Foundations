import java.util.Scanner;

public class nameAgeProgram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jack please enter your age: ");
        int jackAge = sc.nextInt();

        System.out.println("Jill please enter your age: ");
        int jillAge = sc.nextInt();
        int ageDiff = 0;

        if (jackAge < jillAge) {
            ageDiff = jillAge - jackAge;
            System.out.println("Jill is older by " + ageDiff);
        }
        else {
            ageDiff = jackAge - jillAge;
            System.out.println("Jack is older by " + ageDiff + " years");
        }

        System.exit(0);

    }
}
