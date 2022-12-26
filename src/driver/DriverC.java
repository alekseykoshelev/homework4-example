package driver;


import transport.Competing;
import transport.Transport;

public class DriverC extends Driver {

    public DriverC(String firstName, String middleName, String endName, String driverLicense, int experience) {
        super(firstName, middleName, endName, driverLicense, experience);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории C начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории C начинает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель с правами категории C заправляет траснпортное средство");
    }
}
