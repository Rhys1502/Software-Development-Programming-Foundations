import java.util.Scanner;

public class gradeProgram {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your mark: ");
        int mark = sc.nextInt();
        
        String pass = "Pass";
        String fail = "Fail";
        String merit = "Merit";

        if (mark < 50) {
            System.out.println(name + " your mark is " + mark + " and your grade is " + fail);
        }
        else if (mark >= 70) {
            System.out.println(name + " your mark is " + mark + " and your grade is " + merit);
        }
        else {
            System.out.println(name + " your mark is " + mark + " and your grade is " + pass);

        }

        System.exit(0);
    }
}
