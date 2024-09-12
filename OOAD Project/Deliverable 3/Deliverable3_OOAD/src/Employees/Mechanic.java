package Employees;

public class Mechanic {
    private String name;
    private int employeeId;
    private String specialization;

    // Constructors, getters, and setters...

    // toString method
    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    // Get and Set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Get and Set employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Get and Set specialization
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
