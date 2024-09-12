package Booking;

import Dealership.Car;
import Customer.Customer;

public class Reservation {
    private int reservationId;
    private String startDate;
    private String endDate;
    private Car reservedCar;
    private Customer customer;

    // Other methods...

    // Get and Set reservationId
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    // Get and Set startDate
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // Get and Set endDate
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // Get and Set reservedCar
    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    // Get and Set customer
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Other methods...
}
