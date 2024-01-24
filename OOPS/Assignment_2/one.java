// 1. Each customer of a bank has customer id, name, and current loan amount and phone number. One
// can change the attributes like name, phone number. A customer may ask for loan of certain amount. It
// is granted provided the sum of current loan amount and asked amount does not exceed credit limit
// (fixed amount for all customer). A customer may be a privileged amount. For such customers credit limit
// is higher. Once a loan is sanctioned necessary updates should be made. Any type of customer should be
// able to find his credit limit, current loan amount and amount of loan he can seek.
// Design and implement the classes.

class customer {
    protected int customerID; // Customer ID
    protected String name; // Name of the customer
    protected long phoneNumber; // Phone number of the customer
    protected float currentLoanAmount; // Current loan amount
    private float creditLimit; // Credit limit for the customer

    customer() {
    }

    customer(int customerID, String name, long phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.currentLoanAmount = (float) 0; // Initialize current loan amount to 0
        this.creditLimit = (float) 1000000.00; // Initialize credit limit to 1,000,000.00
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter methods

    public void display() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Credit limit: " + creditLimit);
        System.out.println("Current loan amount: " + currentLoanAmount);
        System.out.println("You can take loans upto: " + (creditLimit - currentLoanAmount));
    }

    // loan
    protected boolean isEligible(float loan) {
        if (currentLoanAmount + loan > creditLimit) { // Check if loan exceeds credit limit
            return false;
        }
        return true;
    }

    public void requestloan(float loan) {
        if (isEligible(loan)) { // Check if the customer is eligible for the loan
            this.currentLoanAmount += loan; // Update current loan amount
        } else {
            System.out.println("Credit limit exceeded\nYou can take loan upto: Rs."
                    + (creditLimit - currentLoanAmount)); // Print error message if credit limit is exceeded
        }
    }
}

class privilededCustomer extends customer {
    private float priviledgeCreditLimit; // Credit limit for privileged customers

    privilededCustomer(int customerID, String name, long phoneNumber) {
        super(customerID, name, phoneNumber);
        this.priviledgeCreditLimit = (float) 2000000; // Set privileged credit limit to 2,000,000.00
    }

    @Override
    public void display() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Credit limit: " + priviledgeCreditLimit);
        System.out.println("Current loan amount: " + currentLoanAmount);
        System.out.println("You can take loans upto: " + (priviledgeCreditLimit - currentLoanAmount));
    }

    // loan
    @Override
    protected boolean isEligible(float loan) {
        if (currentLoanAmount + loan > priviledgeCreditLimit) { // Check if loan exceeds privileged credit limit
            return false;
        }
        return true;
    }

    @Override
    public void requestloan(float loan) {
        if (isEligible(loan)) { // Check if the privileged customer is eligible for the loan
            this.currentLoanAmount += loan; // Update current loan amount
        } else {
            System.out.println("Credit limit exceeded\nYou can take loan upto: Rs."
                    + (priviledgeCreditLimit - currentLoanAmount)); // Print error message if credit limit is exceeded
        }
    }
}

public class one {
    public static void main(String args[]) {
        customer c1 = new customer(7587, "Sailik Pandey", 89080980); // Create a regular customer
        c1.requestloan(100000); // Request a loan for the regular customer
        c1.display(); // Display the details of the regular customer
        c1.requestloan(950000); // Request a loan that exceeds the credit limit for the regular customer

        privilededCustomer c2 = new privilededCustomer(2345, "Atanu Nayak", 808732213); // Create a privileged customer
        c2.requestloan(250000); // Request a loan for the privileged customer
        c2.display(); // Display the details of the privileged customer
        c2.requestloan(950000); // Request a loan that exceeds the credit limit for the privileged customer
        c2.display(); // Display the updated details of the privileged customer
    }
}
