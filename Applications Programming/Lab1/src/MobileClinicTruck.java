public class MobileClinicTruck implements EmergencySupport{
    private String truckID;
    private String region;
    private int doctorCnt;
    private double currSpeed;
    private boolean hasMeds;

    public MobileClinicTruck(String truckID, String region, int doctorCnt, boolean hasMeds) {
        this.truckID = truckID;
        this.region = region;
        this.doctorCnt = doctorCnt;
        this.hasMeds = hasMeds;
        this.currSpeed = 0.0;
    }

    public String getTruckID() {
        return truckID;
    }

    public void setTruckID(String truckID) {
        this.truckID = truckID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getDoctorCnt() {
        return doctorCnt;
    }

    public void setDoctorCnt(int doctorCnt) {
        this.doctorCnt = doctorCnt;
    }

    public double getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(double currSpeed) {
        this.currSpeed = currSpeed;
    }

    public boolean isHasMeds() {
        return hasMeds;
    }

    public void setHasMeds(boolean hasMeds) {
        this.hasMeds = hasMeds;
    }

    @Override
    public String toString() {
        return "MobileClinicTruck [truckId=" + truckID +
                ", region=" + region +
                ", doctorCount=" + doctorCnt +
                ", currentSpeed=" + currSpeed +
                ", stockedWithMedicine=" + (hasMeds ? "true" : "false") + "]";
    }

    @Override
    public void deployAid() {
        System.out.println("Mobile clinic truck " + getTruckID() + " deploying " + getDoctorCnt() + " doctors.");
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Truck Emergency Report:\n" +
                "ID: " + getTruckID() + "\n" +
                "Region: " + getRegion() + "\n" +
                "Doctors on Board: " + getDoctorCnt() + "\n" +
                "Medicine: " + (hasMeds ? "Stocked with Medicine" : "No Medicine Available") + "\n" +
                "=======================================";
    }
}
