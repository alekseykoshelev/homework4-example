import driver.DriverC;
import transport.Bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Liaz", "A333", 5.0);
        DriverC driverC = new DriverC("Me", "Me", "Me", "the best", 52);
        bus.drive(driverC);

        System.out.println("Hello world!");
    }
}