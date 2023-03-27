public class Main {
    public static void main(String[] args) {
        EquationSolver equation = new EquationSolver(0,2);
        float x = equation.solve();
        System.out.println("x=" + x);
    }
}