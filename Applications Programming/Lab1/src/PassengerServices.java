public interface PassengerServices {

    // Will start the entertainment service if available
    void startEntertainment();

    // Returns a detailed list of people on board
    String getPassengerManifest();
}
