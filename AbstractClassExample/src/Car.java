class Car extends Vehicle {
    public Car(int wheels, int doors) {
        super(wheels, doors);
    }
    public void start() {
        System.out.println("The car is starting...");
    }
}