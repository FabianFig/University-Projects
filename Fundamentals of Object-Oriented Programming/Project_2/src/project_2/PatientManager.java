package project_2;

import java.io.*;
import java.util.ArrayList;

public class PatientManager {

    private User currUser;
    private ArrayList<Patient> Patients;
    private Patient currViewPatient;

    public PatientManager(User currUser, String patientCSV) throws IOException {
        this.currUser = currUser;
        this.Patients = new ArrayList<>();
        this.currViewPatient = null;
        loadData(patientCSV);
        sortPatientsByID();

        if (currUser instanceof Patient) {
            this.currViewPatient = (Patient) currUser;
        }
    }

    public ArrayList<Patient> getPatients() {
        return Patients;
    }

    private void loadData(String patientCSV) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(patientCSV));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            Patients.add(new Patient(data[0], data[1], data[2], data[3], data[4], data[5]));
        }
        reader.close();
    }

    private Patient binarySearchById(String id) {
        int low = 0, high = Patients.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Patient midPatient = Patients.get(mid);
            if (midPatient.id.equals(id)) {
                return midPatient;
            } else if (midPatient.id.compareTo(id) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public void sortPatientsByID() {
        for (int i = 0; i < Patients.size() - 1; i++) {
            for (int j = 0; j < Patients.size() - i - 1; j++) {
                if (Patients.get(j).id.compareTo(Patients.get(j + 1).id) > 0) {
                    Patient temp = Patients.get(j);
                    Patients.set(j, Patients.get(j + 1));
                    Patients.set(j + 1, temp);
                }
            }
        }
    }

    public void savePatientsToFile(String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (Patient patient : Patients) {
            writer.write(patient.id + "," + patient.username + "," + patient.password + ","
                    + patient.name + "," + patient.email + "," + patient.getTreatmentNotes());
            writer.newLine();
        }
        writer.close();
    }

}
