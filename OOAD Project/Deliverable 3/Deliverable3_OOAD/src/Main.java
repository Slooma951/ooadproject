import Booking.Invoice;
import Booking.Reservation;
import Booking.Refund;
import Customer.Customer;
import Customer.Transaction;
import Customer.TransactionType;
import Dealership.Car;
import Dealership.ConditionType;
import Dealership.ColorType;
import Dealership.FuelType;
import Dealership.MakeType;
import Dealership.ModelType;
import Dealership.Service;
import Dealership.ServiceType;

public class Main {

    public static void main(String[] args) {

        // Create a dealership
        Car car1 = new Car();
        car1.setMake(MakeType.SRT);
        car1.setModel(ModelType.SUV);
        car1.setYear(2022);
        car1.setColor(ColorType.RED);
        car1.setPrice(25000);
        car1.setCondition(ConditionType.JUNK);
        car1.setFuel(FuelType.DIESEL);

        // Set car service
        Service carService = new Service();
        carService.setServiceType(ServiceType.MAINTENANCE);
        carService.setServiceId(1);
        carService.setDescription("Regular Maintenance");
        carService.setCost(200.0);
        carService.setDate("05-01-2023");
        carService.setMechanic("Salem Adefolajuwon");
        car1.setService(carService);

        // Create a reservation (use ConcreteReservation)
        Reservation reservation = new Reservation();
        reservation.setReservationId(123);
        reservation.setStartDate("11-01-2023");
        reservation.setEndDate("21-01-2023");
        reservation.setReservedCar(car1);

        // Create a customer
        Customer customer = new Customer();
        customer.setFirstName("Daniel");
        customer.setLastName("Elatrash");
        customer.setPhone("123-456-7890");
        customer.setAddress("20 Coolock Clane Road");
        customer.setEmail("danielElatrash@example.com");

        // Set customer's transaction
        Transaction customerTransaction = new Transaction();
        customerTransaction.setDate("07-03-2023");
        customerTransaction.setAmount(25000.0);
        customerTransaction.setPaymentInfo("Cash");
        customerTransaction.setTransactionType(TransactionType.CASH);
        customer.setTransaction(customerTransaction);

        reservation.setCustomer(customer);

        // Create an invoice
        Invoice invoice = new Invoice(1, "01-11-2023", 25000.0, reservation);

        // Print information
        System.out.println("Car Information:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());
        System.out.println("FuelType: " + car1.getFuel());
        System.out.println("ConditionType: " + car1.getCondition());
        System.out.println("Price: €" + car1.getPrice());

        System.out.println("\nService Information:");
        System.out.println("Service ID: " + carService.getServiceId());
        System.out.println("Mechanic: " + carService.getMechanic());
        System.out.println("Date: " + carService.getDate());
        System.out.println("Service Type: " + carService.getServiceType());
        System.out.println("Description: " + carService.getDescription());
        System.out.println("Cost: €" + carService.getCost());

        System.out.println("\nCustomer Information:");
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Contact Number: " + customer.getPhone());
        System.out.println("Customer Email: " + customer.getEmail());

        System.out.println("\nTransaction Information:");
        System.out.println("Transaction Date: " + customer.getTransaction().getDate());
        System.out.println("Transaction Amount: €" + customer.getTransaction().getAmount());
        System.out.println("Payment Info: " + customer.getTransaction().getPaymentInfo());
        System.out.println("Transaction Type: " + customer.getTransaction().getTransactionType());

        System.out.println("\nReservation Details:");
        System.out.println("Reservation ID: " + reservation.getReservationId());
        System.out.println("Start Date: " + reservation.getStartDate());
        System.out.println("End Date: " + reservation.getEndDate());
        System.out.println("Reserved Car: " + reservation.getReservedCar().getMake() + " " + reservation.getReservedCar().getModel());
        System.out.println("Fuel Type: " + reservation.getReservedCar().getFuel());
        System.out.println("Payment: " + customer.getTransaction().getPaymentInfo());
        System.out.println("Total Amount: €" + invoice.getTotalAmount());
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Address: " + customer.getAddress());

        // Refund System
        Refund refund = new Refund(1, "15-01-2023", 100.0, reservation);
        System.out.println("\nRefund Information:");
        System.out.println("Refund ID: " + refund.getRefundID());
        System.out.println("Refund Date: " + refund.getRefundDate());
        System.out.println("Refund Amount: €" + refund.getAmount());
        System.out.println("Refund Reservation ID: " + refund.getRefundReservation().getReservationId());
    }
}
