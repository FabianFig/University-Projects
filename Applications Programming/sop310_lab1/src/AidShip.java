public class AidShip extends Ship implements EmergencySupport{
    private String aidType;
    private int suppliesOnBoard;
    private boolean hasHelipad;

    public AidShip(String name, String registrationNumber, double tonnage, int crewSize,
                   String currentPort, String aidType, int suppliesOnBoard, boolean hasHelipad) {
        super(name, registrationNumber, tonnage, crewSize, 0.0, currentPort);
        this.aidType = aidType;
        this.suppliesOnBoard = suppliesOnBoard;
        this.hasHelipad = hasHelipad;
    }

    public String getAidType() {
        return aidType;
    }

    public void setAidType(String aidType) {
        this.aidType = aidType;
    }

    public int getSuppliesOnBoard() {
        return suppliesOnBoard;
    }

    public void setSuppliesOnBoard(int suppliesOnBoard) {
        this.suppliesOnBoard = suppliesOnBoard;
    }

    public boolean isHasHelipad() {
        return hasHelipad;
    }

    public void setHasHelipad(boolean hasHelipad) {
        this.hasHelipad = hasHelipad;
    }

    @Override
    public void deployAid() {
        System.out.println("Aid Ship "+ getName() + " is deploying " + getSuppliesOnBoard() + " of Medical aid.");
    }

    @Override
    public String toString() {
        return "AidShip [name='" + getName() +
                "', registrationNumber=" + getRegistrationNumber() +
                ", tonnage=" + getTonnage() +
                ", crewSize=" + getCrewSize() +
                ", currentSpeed=" + getCurrentSpeed() +
                ", currentPort=" + getCurrentPort() +
                ", aidType=" + getAidType() +
                ", suppliesOnBoard=" + getSuppliesOnBoard() +
                ", hasHelipad=" + (hasHelipad ? "true" : "false") + "]";
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Aid Ship Emergency Report:\n" +
                "Name: " + getName() + "\n" +
                "Aid type: " + getAidType() + "\n" +
                "Supplies on Board: " + getSuppliesOnBoard() + "\n" +
                "Helipad: " + (hasHelipad ? "Available" : "Not Available") + "\n" +
                "=======================================";
    }

    @Override
    public void setCurrentSpeed(double speed) {
        super.setCurrentSpeed(speed);
    }
}
