public class Main {
    public static void main(String[] args) {
        String filename = "input.txt";
        FileSumCalculator calculator = new FileSumCalculator(filename);
        int sum = calculator.calculateSum();
        System.out.println("Sum of integers in file: " + sum);
    }
}