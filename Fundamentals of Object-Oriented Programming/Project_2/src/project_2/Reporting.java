package project_2;

import java.io.*;
import java.util.List;

public class Reporting {

    public static void generateReport(List<Patient> patients, String filePath, String reportType) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        writer.write("ID,Name,Email");
        writer.newLine();

        switch (reportType.toLowerCase()) {
            case "id":
                bubbleSortById(patients);
                for (Patient patient : patients) {
                    writer.write(patient.getId() + "," + patient.getName() + "," + patient.getEmail());
                    writer.newLine();
                }
                break;

            case "name":
                bubbleSortByName(patients);
                for (Patient patient : patients) {
                    writer.write(patient.getId() + "," + patient.getName() + "," + patient.getEmail());
                    writer.newLine();
                }
                break;

            case "email":
                bubbleSortByEmail(patients);
                for (Patient patient : patients) {
                    writer.write(patient.getId() + "," + patient.getName() + "," + patient.getEmail());
                    writer.newLine();
                }
                break;

            default:
                System.out.println("Invalid report type.");
        }

        writer.close();
        System.out.println("Report generated successfully at: " + filePath);
    }

    private static void bubbleSortById(List<Patient> patients) {
        for (int i = 0; i < patients.size() - 1; i++) {
            for (int j = 0; j < patients.size() - i - 1; j++) {
                if (patients.get(j).getId() > patients.get(j + 1).getId()) {
                    Patient temp = patients.get(j);
                    patients.set(j, patients.get(j + 1));
                    patients.set(j + 1, temp);
                }
            }
        }
    }

    private static void bubbleSortByName(List<Patient> patients) {
        for (int i = 0; i < patients.size() - 1; i++) {
            for (int j = 0; j < patients.size() - i - 1; j++) {
                if (patients.get(j).getName().compareTo(patients.get(j + 1).getName()) > 0) {
                    Patient temp = patients.get(j);
                    patients.set(j, patients.get(j + 1));
                    patients.set(j + 1, temp);
                }
            }
        }
    }

    private static void bubbleSortByEmail(List<Patient> patients) {
        for (int i = 0; i < patients.size() - 1; i++) {
            for (int j = 0; j < patients.size() - i - 1; j++) {
                if (patients.get(j).getEmail().compareTo(patients.get(j + 1).getEmail()) > 0) {
                    Patient temp = patients.get(j);
                    patients.set(j, patients.get(j + 1));
                    patients.set(j + 1, temp);
                }
            }
        }
    }
}
