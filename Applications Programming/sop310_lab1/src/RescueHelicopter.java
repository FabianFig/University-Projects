public class RescueHelicopter implements EmergencySupport{
    private String callSign;
    private String location;
    private double speed;
    private int numMedKits;
    private double altitude;
    private double currSpeed;
    private boolean hasHoist;

    public RescueHelicopter(String callSign, String location, int numMedKits, boolean hasHoist) {
        this.callSign = callSign;
        this.location = location;
        this.speed = 0.0;
        this.numMedKits = numMedKits;
        this.altitude = 0.0;
        this.currSpeed = 0.0;
        this.hasHoist = hasHoist;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumMedKits() {
        return numMedKits;
    }

    public void setNumMedKits(int numMedKits) {
        this.numMedKits = numMedKits;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(double currSpeed) {
        this.currSpeed = currSpeed;
    }

    public boolean isHasHoist() {
        return hasHoist;
    }

    public void setHasHoist(boolean hasHoist) {
        this.hasHoist = hasHoist;
    }

    @Override
    public void deployAid() {
        System.out.println("Rescue helicopter " + getCallSign() + " deploying " + getNumMedKits() + " of Medical Aid.");
    }

    @Override
    public String toString() {
        return "RescueHelicopter [CallSign='" + getCallSign() +
                "' , baseLocation='" + getLocation() +
                "' , currentSpeed=" + getCurrSpeed() +
                ", altitude=" + getCurrSpeed() +
                ", medicalKits=" + getNumMedKits() +
                ", hasRescueHoist=" + (hasHoist ? "true" : "false") + "]";
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Helicopter Emergency Report:\n" +
                "Call Sign: " + getCallSign() + "\n" +
                "Base Location: " + getLocation() + "\n" +
                "Medical Kits: " + getNumMedKits() + "\n" +
                "Rescue Hoist: " + (hasHoist ? "Available" : "Not Available") + "\n" +
                "=======================================";
    }
}
