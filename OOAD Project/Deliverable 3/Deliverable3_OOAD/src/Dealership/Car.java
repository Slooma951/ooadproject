package Dealership;

public class Car {
    private MakeType make;
    private ModelType model;
    private int year;
    private ColorType color;
    private double price;
    private ConditionType condition;
    private FuelType fuel;
    private Service service;  // Added Service instance

    // Constructors
    public Car() {
        // Default constructor
    }

    public Car(MakeType make, ModelType model, int year, ColorType color, double price,
               ConditionType condition, FuelType fuel, Service service) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.condition = condition;
        this.fuel = fuel;
        this.service = service;
    }

    // Getter and Setter methods for make
    public MakeType getMake() {
        return make;
    }

    public void setMake(MakeType make) {
        this.make = make;
    }

    // Getter and Setter methods for model
    public ModelType getModel() {
        return model;
    }

    public void setModel(ModelType model) {
        this.model = model;
    }

    // Getter and Setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and Setter methods for color
    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    // Getter and Setter methods for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter methods for condition
    public ConditionType getCondition() {
        return condition;
    }

    public void setCondition(ConditionType condition) {
        this.condition = condition;
    }

    // Getter and Setter methods for fuel
    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    // Getter and Setter methods for service
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    // Other methods...
}
