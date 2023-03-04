import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) throws Exception {
    String a,b,c = " ";
    int age = 0;
    try (Scanner sc = new Scanner(new File("../employees.txt"))) {

        while (sc.hasNextLine()) {

        a = sc.next();
        b = sc.next();
        c = sc.next();

        age = Integer.parseInt(c);
        if (age >=25 || b == "Male") {
            System.out.println("Employee found");
        }
        else {
            System.out.println("Ignore");
        }

        }

    }

    catch (FileNotFoundException | NoSuchElementException e) {
    e.printStackTrace();

    }

    }
}


