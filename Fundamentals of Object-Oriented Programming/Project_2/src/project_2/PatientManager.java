package project_2;

import java.io.*
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
		
		if(currUser instanceof Patient) {
			this.currViewPatient = (Patient) currUser;
		}
	}
	
	private void loadData(String patientCSV) throws IOException {
		BufferedReader = new BufferedReader(new FileReader(patientCSV));
		String line;
		while((line = reader.readLine()) != null) {
			String[] data = line.split(",");
			patients.add(new Patient(data[0], data[1], data[2], data[3], data[4], data[5]));
		}
		reader.close();
	}
	
	private void sortPatientsByID() {
		int low = 0, high = patients.size() - 1;
		while
	}

}
