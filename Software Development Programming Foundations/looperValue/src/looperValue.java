public class looperValue {
    public static void main(String[] args) throws Exception {
        for (int number = 1; number <= 19;  number = number+2) {
            int value = (number * number) + 5;
            System.out.println("The square value add 5 of " + number + " is " + value);
        }

        System.out.println("End of program");
        System.exit(0);
    }
}
