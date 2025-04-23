package project_2;

import java.util.*;

public class Patient extends User {
	private String treatment_notes;
	
	public Patient(String id, String username, String password, String name, String email, String treatment_notes) {
		super(id, username, password, name, email);
		this.treatment_notes = treatment_notes;
	}
	
	public String getTreatmentNotes() {
		return treatment_notes;
	}
	public void setTreatmentNotes(String treatment_notes) {
		this.treatment_notes = treatment_notes;
	}
	
	@Override
	public String toString() {
		return "Patient placeholder";
	}

}
