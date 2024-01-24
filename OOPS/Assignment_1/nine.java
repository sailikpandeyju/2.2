//Design a BankAcct class with account number, balance and interest rate as attribute.
//Interest rate is same for all account. Support must be there to initialize, change and
//display the interest rate. Also supports are to be there to return balance and calculate
//interest

class BankAcct {
    private int accountNumber; // private attribute to store the account number
    private float balance; // private attribute to store the account balance
    private static float interestRate; // private static attribute to store the interest rate

    BankAcct() {
    }

    BankAcct(int accountNumber, float balance, float interestRate) {
        this.accountNumber = accountNumber; // initialize the account number
        this.balance = balance; // initialize the account balance
        BankAcct.interestRate = interestRate; // initialize the interest rate (static variable)
    }

    // setter methods

    public void changeInterestRate(float interestRate) {
        BankAcct.interestRate = interestRate; // change the interest rate (static variable)
    }

    public void displayInterestRate() {
        System.out.println("The interest rate is: " + interestRate); // display the current interest rate
    }

    // getter methods

    public float getBalance() {
        return balance; // return the account balance
    }

    public float calculateInterest() {
        float interestCalculated = balance * (interestRate / 100); // calculate the interest amount
        balance += interestCalculated; // add the interest to the account balance
        return interestCalculated; // return the calculated interest amount
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber); // display the account number
        System.out.println("Balance: " + balance); // display the account balance
        System.out.println("Interest Rate: " + interestRate); // display the interest rate
    }
}

public class nine {
    public static void main(String args[]) {
        // Create BankAcct objects
        BankAcct account1 = new BankAcct(123456, 1000.0f, 2.5f);
        BankAcct account2 = new BankAcct(789012, 5000.0f, 2.5f);

        // Display initial details of account1
        System.out.println("Account 1 - Initial Details:");
        account1.display();

        // Display initial details of account2
        System.out.println("Account 2 - Initial Details:");
        account2.display();

        // Change interest rate for account1
        account1.changeInterestRate(3.0f);

        // Display interest rate for account1
        System.out.println("Account 1 - Updated Interest Rate:");
        account1.displayInterestRate();

        // Calculate interest for account1
        float interest1 = account1.calculateInterest();
        System.out.println("Account 1 - Calculated Interest: " + interest1);

        // Calculate interest for account2
        float interest2 = account2.calculateInterest();
        System.out.println("Account 2 - Calculated Interest: " + interest2);

        // Display updated details of account1
        System.out.println("Account 1 - Updated Details:");
        account1.display();

        // Display updated details of account2
        System.out.println("Account 2 - Updated Details:");
        account2.display();
    }
}
