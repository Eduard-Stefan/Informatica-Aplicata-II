abstract class Vehicle {
    protected int wheels;
    protected int doors;
    public Vehicle(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }
    public abstract void start();
    public int getWheels() {
        return wheels;
    }
    public int getDoors() {
        return doors;
    }
}