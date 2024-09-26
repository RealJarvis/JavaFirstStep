// importing Java input library
import java.util.Scanner;
// creating the class in java
public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age and I will tell you how old will you be in 2050");
        int age = scanner.nextInt();

        System.out.println("You will be " + (age + 26) + " years old");

        scanner.close();
    }
}