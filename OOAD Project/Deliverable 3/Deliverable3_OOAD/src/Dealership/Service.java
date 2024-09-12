package Dealership;

public class Service {
    private int serviceId;
    private String description;
    private double cost;
    private String date;
    private String mechanic;
    private ServiceType serviceType;  // Add this field

    // Constructors
    public Service() {
        // Default constructor
    }

    public Service(int serviceId, String description, double cost, String date, String mechanic, ServiceType serviceType) {
        this.serviceId = serviceId;
        this.description = description;
        this.cost = cost;
        this.date = date;
        this.mechanic = mechanic;
        this.serviceType = serviceType;  // Initialize the serviceType field
    }

    // Get and Set methods for serviceId
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    // Get and Set methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Get and Set methods for cost
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Get and Set methods for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Get and Set methods for mechanic
    public String getMechanic() {
        return mechanic;
    }

    public void setMechanic(String mechanic) {
        this.mechanic = mechanic;
    }

    // Get and Set methods for serviceType
    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
