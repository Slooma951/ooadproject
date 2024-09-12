package Customer;
import Customer.TransactionType;

public class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String paymentInfo;
    private TransactionType transactionType;
    private String identification;
    private String email;
    private Transaction transaction;
    public Transaction getTransaction() {

        return transaction;

    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get and Set lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Get and Set phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Get and Set address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Get and Set paymentInfo
    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    // Get and Set transactionType
    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    // Get and Set identification
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    // Get and Set email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
