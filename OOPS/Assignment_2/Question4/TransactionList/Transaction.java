package TransactionList;

public class Transaction {
    private int memberID; // Private variable to store the member ID associated with the transaction
    private int bookID; // Private variable to store the book ID associated with the transaction

    public Transaction() {
        // Default constructor
    }

    public Transaction(int memberID, int bookID) {
        this.memberID = memberID; // Initialize the member ID with the provided value
        this.bookID = bookID; // Initialize the book ID with the provided value
    }

    // Getter methods

    public int getMemberID() {
        return memberID; // Return the member ID associated with the transaction
    }

    public int getBookID() {
        return bookID; // Return the book ID associated with the transaction
    }

    // Setter methods

    public void changeTransactionMemberID(int memberID) {
        this.memberID = memberID; // Change the member ID associated with the transaction to the provided value
    }

    public void changeTransactionBookID(int bookID) {
        this.bookID = bookID; // Change the book ID associated with the transaction to the provided value
    }

}
