package Booking;

// Refund class
public class Refund {
    // Fields
    private int refundID;
    private String refundDate;
    private double amount;
    private Reservation refundReservation;

    // Constructors
    public Refund() {
        // Default constructor
    }

    public Refund(int refundID, String refundDate, double amount, Reservation refundReservation) {
        this.refundID = refundID;
        this.refundDate = refundDate;
        this.amount = amount;
        this.refundReservation = refundReservation;
    }

    // Get and Set methods for refundID
    public int getRefundID() {
        return refundID;
    }

    public void setRefundID(int refundID) {
        this.refundID = refundID;
    }

    // Get and Set methods for refundDate
    public String getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(String refundDate) {
        this.refundDate = refundDate;
    }

    // Get and Set methods for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Get and Set methods for refundReservation
    public Reservation getRefundReservation() {
        return refundReservation;
    }

    public void setRefundReservation(Reservation refundReservation) {
        this.refundReservation = refundReservation;
    }
}
