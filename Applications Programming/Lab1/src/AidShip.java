/**
 * The AidShip class represents an AidShip
 * @author Fabian Figueroa
 */

public class AidShip extends Ship implements EmergencySupport{
    private String aidType;
    private int suppliesOnBoard;
    private boolean hasHelipad;

    /**
     * @param name the name of the ship
     * @param registrationNumber the registration number of the ship
     * @param tonnage the weight of the ship
     * @param crewSize the number of crew members aboard the ship
     * @param currentPort the current location of the aid ship
     * @param aidType the type of aid the ship is carrying
     * @param suppliesOnBoard the amount of supplies the ship has on board
     * @param hasHelipad whether the ship has a helipad or not
     */

    public AidShip(String name, String registrationNumber, double tonnage, int crewSize,
                   String currentPort, String aidType, int suppliesOnBoard, boolean hasHelipad) {
        super(name, registrationNumber, tonnage, crewSize, 0.0, currentPort);
        this.aidType = aidType;
        this.suppliesOnBoard = suppliesOnBoard;
        this.hasHelipad = hasHelipad;
    }

    /**
     * returns the type of aid aboard the shp
     * @return String, the type of aid aboard
     */
    public String getAidType() {
        return aidType;
    }

    /**
     * sets the type of aid
     * @param aidType, the type of aid (String)
     */
    public void setAidType(String aidType) {
        this.aidType = aidType;
    }

    /**
     * returns the number of supplies on board
     * @return int, the number of supplies
     */
    public int getSuppliesOnBoard() {
        return suppliesOnBoard;
    }

    /**
     * sets the amount of supplies on board
     * @param suppliesOnBoard, the number of supplies on board (int)
     */
    public void setSuppliesOnBoard(int suppliesOnBoard) {
        this.suppliesOnBoard = suppliesOnBoard;
    }

    /**
     * returns true or false depending on whether the ship has a helipad
     * @return boolean, status of a helipad on board
     */
    public boolean HasHelipad() {
        return hasHelipad;
    }

    /**
     * sets the status of a helipad
     * @param hasHelipad, status of a helippad on board (boolean)
     */
    public void setHasHelipad(boolean hasHelipad) {
        this.hasHelipad = hasHelipad;
    }

    /**
     * prints string indicating the name of the ship and the number of aid it is deploying
     */
    @Override
    public void deployAid() {
        System.out.println("Aid Ship "+ getName() + " is deploying " + getSuppliesOnBoard() + " of Medical aid.");
    }

    /**
     * returns a string detailing the attributes of the ship
     * @return String, details of ship
     */
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

    /**
     * returns a string dictating the necessary attribute details for emergency readiness
     * @return String, returns details related directly to aid/emergency assistance
     */
    @Override
    public String getEmergencyReadinessReport() {
        return "Aid Ship Emergency Report:\n" +
                "Name: " + getName() + "\n" +
                "Aid type: " + getAidType() + "\n" +
                "Supplies on Board: " + getSuppliesOnBoard() + "\n" +
                "Helipad: " + (hasHelipad ? "Available" : "Not Available") + "\n" +
                "=======================================";
    }

    /**
     * sets the current speed of the aid ship
     * @param speed, sets speed of the ship (double)
     */
    @Override
    public void setCurrentSpeed(double speed) {
        super.setCurrentSpeed(speed);
    }
}
