package Employees;

public class Payroll {
    public double salary;
    public String paymentDate;
    public double amount;

    public Payroll() {

    }

    public Payroll(double salary, String paymentDate, double amount) {
        this.salary = salary;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
