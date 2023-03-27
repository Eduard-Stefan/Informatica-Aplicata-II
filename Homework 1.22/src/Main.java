import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = null;
        Integer number2 = null;
        try {
            System.out.print("Enter the first number: ");
            number1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            number2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have not entered a valid integer.");
            System.exit(0);
        }
        int sum = number1 + number2;
        System.out.println("The sum of the numbers is: " + sum);
    }
}
