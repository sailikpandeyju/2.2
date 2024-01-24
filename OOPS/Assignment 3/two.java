// 2. There are number of accounts. Each account has account number (unique), name of the account and
// balance. Very frequent query is to provide the balance for an account. Other requirements are to verify
// the existence of an account, adding new account and displaying all accounts.
// Design and implement the necessary classes.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private int accountNumber; // Private field to store the account number
    private String accountName; // Private field to store the account name
    private float balance; // Private field to store the account balance

    Account() {
    }

    // Constructor to initialize the account with account number, account name, and
    // balance
    Account(int accountNumber, String accountName, float balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNumber() { // returns the account number
        return accountNumber;
    }

    public void display() {
        System.out.println("****************");
        System.out.println("Account Number: " + accountNumber); // Print the account number
        System.out.println("Account Name: " + accountName); // Print the account name
        System.out.println("Balance: " + balance); // Print the account balance
        System.out.println("****************");
    }
}

class Bank {
    private Map<Integer, Account> accountList; // Private field to store the collection of accounts using a HashMap

    Bank() {
        accountList = new HashMap<Integer, Account>(); // Initialize the accountList HashMap
    }

    // Method to verify if an account exists in the accountList
    public void verifyAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        if (accountList.containsKey(accountNumber)) {
            System.out.println("The account is a valid account!");
        } else {
            System.out.println("The Account does not exist");
        }
        sc.close();
    }

    // Method to add a new account to the accountList
    public void addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        int accountNumber = sc.nextInt();
        if (accountList.containsKey(accountNumber)) {
            System.out.println("Please enter a unique account number");
            sc.close();
            return;
        }
        System.out.println("Enter the account name: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.println("Enter the balance of the account");
        float balance = sc.nextFloat();

        Account temp = new Account(accountNumber, accountName, balance);
        accountList.put(accountNumber, temp);
        System.out.println("Account successfully added!");
        sc.close();
    }

    // Method to display details of all accounts in the accountList
    public void displayAllAccounts() {
        for (Map.Entry<Integer, Account> iterate : accountList.entrySet()) {
            iterate.getValue().display();
        }
    }
}

public class two {
    public static void main(String args[]) {
        Bank b = new Bank(); // Create an instance of the Bank class
        int n = 1;
        Scanner sc = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Enter 1 to verify bank account");
            System.out.println("Enter 2 to add a bank account");
            System.out.println("Enter 3 to display all bank account details");
            System.out.println("Enter 0 to exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    b.verifyAccount(); // Call the verifyAccount method of the Bank class
                    break;
                case 2:
                    b.addAccount(); // Call the addAccount method of the Bank class
                    break;
                case 3:
                    b.displayAllAccounts(); // Call the displayAllAccounts method of the Bank class
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
