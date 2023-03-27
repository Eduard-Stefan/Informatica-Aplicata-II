import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    int readNumber() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static void main(String[] args) {
        App app1 = new App();
        Integer nr, sum;
        sum = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                nr = app1.readNumber();
                sum += nr;
                isInt = true;
            } catch (InputMismatchException ex) {
                System.err.println("Value is not an integer");
            }
        }
        isInt = false;
        while (!isInt) {
            try {
                nr = app1.readNumber();
                sum += nr;
                isInt = true;
            } catch (InputMismatchException ex) {
                System.err.println("Value is not an integer");
            }
        }
        System.out.println("Suma:" + sum);
    }
}
