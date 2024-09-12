package Employees;

// Abstract class for Employee
public abstract class Employee {
    private String name;
    private int employeeId;
    private String phone;
    private String position;
    private double hourlyRate;

    // Get and Set methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Get and Set methods for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Get and Set methods for phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Get and Set methods for position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Get and Set methods for hourlyRate
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Abstract method for calculating monthly salary
    public abstract double calculateMonthlySalary();
}
