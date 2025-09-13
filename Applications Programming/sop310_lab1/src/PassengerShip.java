public class PassengerShip extends Ship implements PassengerServices{
    private int passengerCapacity;
    private int passengerCnt;
    private int cabinCnt;
    private boolean hasEntertainment;

    public PassengerShip(String name, String registrationNumber, double tonnage, int crewSize, String currPort,
                         double currSpeed, int passengerCapacity, int cabinCnt, boolean hasEntertainment) {
        super(name, registrationNumber, tonnage, crewSize, currSpeed, currPort);
        this.passengerCapacity = passengerCapacity;
        this.cabinCnt = cabinCnt;
        this.hasEntertainment = hasEntertainment;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCnt() {
        return passengerCnt;
    }

    public void setPassengerCnt(int passengerCnt) {
        this.passengerCnt = passengerCnt;
    }

    public int getCabinCnt() {
        return cabinCnt;
    }

    public void setCabinCnt(int cabinCnt) {
        this.cabinCnt = cabinCnt;
    }

    public boolean isHasEntertainment() {
        return hasEntertainment;
    }

    public void setHasEntertainment(boolean hasEntertainment) {
        this.hasEntertainment = hasEntertainment;
    }


    @Override
    public void dock(String port) {
        super.dock(port);
        disembarkPassengers();
    }

    public void disembarkPassengers() {
        System.out.println(passengerCnt + " passengers are disembarking.");
        passengerCnt = 0;
        setCurrentSpeed(0.0);
    }

    @Override
    public void startEntertainment() {
        if (hasEntertainment) {
            System.out.println(getName() + " is starting entertainment services.");
        }  else {
            System.out.println(getName() + " has no entertainment services.");
        }
    }


    @Override
    public String getPassengerManifest() {
        return "Passenger Ship manifest: \n" +
                "Name: " + getName() + "\n" +
                "Passenger Capacity: " + passengerCapacity + "\n" +
                "Cabins: " + cabinCnt + "\n";
    }

    @Override
    public String toString() {
        return "Passenger Ship [name=" + getName() +
                ", registrationNumber=" + getRegistrationNumber() +
                ", tonnage=" + getTonnage() +
                ", crewSize=" + getCrewSize() +
                ", currentSpeed=" + getCurrentSpeed() +
                ", currentPort=" + getCurrentPort() +
                ", passengerCapacity: " + passengerCapacity +
                ", passengerCount: " + passengerCnt +
                ", numberOfCabins: " + cabinCnt +
                ", hasEntertainmentFacilities: " + hasEntertainment + "]";
    }

}
