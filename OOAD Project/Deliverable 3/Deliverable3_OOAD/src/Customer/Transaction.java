package Customer;

public final class Transaction {
    private String date;
    private double amount;
    private String paymentInfo;
    private TransactionType transactionType;

    // Get and Set date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Get and Set amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
}
