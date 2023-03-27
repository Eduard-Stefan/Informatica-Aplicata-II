public class Main {
    public static int divide(int a) {
        int b;
        try {
            b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("Impartire prin 0. b=0");
            b = 0;
            e.printStackTrace();
        } catch (Exception e) {
            b = -1;
            System.out.println("Eroare generala");
            e.printStackTrace();
        }
        return b;
    }
    public static void main(String[] args) {
        int a = 0;
        int b = divide(a);
        System.out.print("b=" + b);
    }
}
/*
  Diferența dintre tratarea excepțiilor în interiorul metodei și aruncarea lor mai departe constă în faptul că,
  în prima abordare, clientul metodei nu trebuie să se ocupe de excepțiile aruncate de aceasta. În schimb,
  dacă excepția este aruncată mai departe, clientul trebuie să o gestioneze sau să o arunce la rândul său.
  Astfel, tratarea excepțiilor în interiorul metodei este mai flexibilă,
  deoarece nu încarcă clientul cu responsabilitatea gestionării excepțiilor.
*/