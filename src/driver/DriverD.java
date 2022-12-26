package driver;

import transport.Competing;
import transport.Transport;

public class DriverD extends Driver {

    public DriverD(String firstName, String middleName, String endName, String driverLicense, int experience) {
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
            System.out.println("Водитель с правами категории D начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории D начинает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель с правами категории D заправляет траснпортное средство");
    }
}
