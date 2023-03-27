public class EquationSolver {
    private float a;
    private float b;
    public EquationSolver(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public float solve() {
        float result = 0;
        try {
            if (a == 0)
                result = (int) - b / (int) a;
            else
                result = - b / a;
        } catch (ArithmeticException e) {
            System.out.println("Impartire prin 0");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Eroare generala");
            e.printStackTrace();
        }
        return result;
    }
}