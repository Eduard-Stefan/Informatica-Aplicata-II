public class Robot implements Computer, Mechanism {
    @Override
    public void boot() {
        System.out.println("The robot is booting...");
    }
    @Override
    public void Move() {
        System.out.println("The robot is moving...");
    }
    @Override
    public void on() {
        System.out.println("The robot is turning on...");
    }
    @Override
    public void off() {
        System.out.println("The robot is turning off...");
    }
}