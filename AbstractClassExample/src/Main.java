public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4, 4);
        myCar.start();
        System.out.println("My car has " + myCar.getWheels() + " wheels and " + myCar.getDoors() + " doors.");
    }
}