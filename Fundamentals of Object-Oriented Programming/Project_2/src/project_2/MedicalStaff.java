package project_2;

public class MedicalStaff extends User {

    private String department;

    public MedicalStaff(String id, String username, String password, String name, String email, String department) {
        super(id, username, password, name, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "MedicalStaff [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
    }
}
