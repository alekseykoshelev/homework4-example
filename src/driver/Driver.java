package driver;

import transport.Competing;
import transport.Transport;

import java.util.Objects;

public abstract class Driver {
    private String firstName;
    private String middleName;
    private String endName;
    private String driverLicense;
    private int experience;

    public Driver(String firstName, String middleName, String endName, String driverLicense, int experience) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.endName = endName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


}


