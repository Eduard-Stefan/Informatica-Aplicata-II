import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Tesla");
        cars.add("Audi");
        cars.add("Mercedes");
        System.out.println(cars);
        //HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England", "London");
        System.out.println(capitalCities);
    }
}