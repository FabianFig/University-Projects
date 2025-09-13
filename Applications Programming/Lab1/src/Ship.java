public abstract class Ship implements Navigable{
    private String name;
    private String registrationNumber;
    private double tonnage;
    private int crewSize;
    private double currentSpeed;
    private String currentPort;

    public Ship(String name, String registrationNumber, double tonnage, int crewSize, double speed, String currentPort) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.tonnage = tonnage;
        this.crewSize = crewSize;
        this.currentSpeed = currentSpeed;
        this.currentPort = currentPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public String getCurrentPort() {
        return currentPort;
    }

    public void setCurrentPort(String currentPort) {
        this.currentPort = currentPort;
    }

    public void setCurrentSpeed(double speed) {
        this.currentSpeed = speed;
    }

    @Override
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void navigateTo(String location) {
        System.out.println(name + " is going to " + location);
        this.currentPort = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + name +
                ", Registration Number: " + registrationNumber +
                ", Tonnage=" + tonnage +
                ", Crew Size=" + crewSize +
                ", Current Speed=" + currentSpeed +
                ", Current Port=" + currentPort + "]";
    }

    public void dock(String port) {
        this.currentPort = port;
        this.currentSpeed = 0.0;
    }

}