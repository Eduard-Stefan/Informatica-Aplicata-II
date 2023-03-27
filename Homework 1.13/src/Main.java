public class Main {
    public static void main(String[] args) {
        String filename = "input.txt";
        Doublex calculator = new Doublex(filename);
        float x = calculator.calculateSum();
        System.out.println("2*x=" + x);
    }
}