import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);
        System.out.println("List before sorting: " + numbers);
        numbers.sort(null);
        System.out.println("List after sorting: " + numbers);
    }
}