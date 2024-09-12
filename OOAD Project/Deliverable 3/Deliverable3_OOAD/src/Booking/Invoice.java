package Booking;

// Invoice class
public class Invoice {
    // Fields
    private int invoiceID;
    private String issuedDate;
    private double totalAmount;
    private Reservation invoiceReservation;

    // Constructors
    public Invoice() {
        // Default constructor
    }

    public Invoice(int invoiceID, String issuedDate, double totalAmount, Reservation invoiceReservation) {
        this.invoiceID = invoiceID;
        this.issuedDate = issuedDate;
        this.totalAmount = totalAmount;
        this.invoiceReservation = invoiceReservation;
    }

    // Get and Set methods for invoiceID
    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    // Get and Set methods for issuedDate
    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    // Get and Set methods for totalAmount
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Get and Set methods for invoiceReservation
    public Reservation getInvoiceReservation() {
        return invoiceReservation;
    }

    public void setInvoiceReservation(Reservation invoiceReservation) {
        this.invoiceReservation = invoiceReservation;
    }
}
