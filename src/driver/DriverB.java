package driver;

public class DriverB extends Driver {
    public DriverB(String firstName, String middleName, String endName, String driverLicense, int experience) {
        super(firstName, middleName, endName, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории Б начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории Б заканчивает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель с правами категории Б заправляет транспортное средство.");
    }
}




