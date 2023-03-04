import java.util.Scanner;

public class travelExpense {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Please enter your fuel type");
        String fuel = sc.nextLine();

        System.out.println("Please enter your engine capacity in cc: ");
        int capacity = sc.nextInt();

        System.out.println("Please enter the distance travelled in km: ");
        int distance = sc.nextInt();

        double expense = 0;
        double rate = 0;
        if (capacity <= 1100 && fuel.equals("Petrol")) {
            rate = (0.06 * 0.1) + 0.06;
            expense = rate * distance;
        }
        else if (capacity <= 1100) {
            rate = 0.06;
            expense = rate * distance;
        }
        else if (capacity >= 1101 && capacity <= 1500 && fuel.equals("Petrol")) {
            rate = (0.07 * 0.1) + 0.07;
            expense = rate * distance;
        }
        else if (capacity >= 1101 && capacity <= 1500) {
            rate = 0.07;
            expense = rate * distance;
        }
        else if (capacity > 1501 && fuel.equals("Petrol")) {
            rate = (0.08 * 0.1) + 0.08;
            expense = rate * distance;
        }
        else if (capacity > 1501) {
            rate = 0.08;
            expense = rate * distance;
        }
        
        expense = Math.round(expense *100.0)/100.0;

        System.out.println("The travel expense due for " + name + " is: £" + expense);
        System.exit(0);
    }
}
