package BookList;

public class Book {
    private int bookID; // Private variable to store the book ID
    private String title; // Private variable to store the book title
    private int totalCopiesPurchased; // Private variable to store the total number of copies purchased
    private int copiesAvailable; // Private variable to store the number of copies available

    public Book() {
        // Default constructor
    }

    public Book(int bookID, String title, int copiesAvailable) {
        this.bookID = bookID; // Initialize the book ID with the provided value
        this.title = title; // Initialize the book title with the provided value
        this.totalCopiesPurchased = 0; // Set the total copies purchased to 0 initially
        this.copiesAvailable = copiesAvailable; // Initialize the number of copies available with the provided value
    }

    public int getBookID() {
        return bookID; // Return the book ID
    }

    public int getCopiesAvailable() {
        return copiesAvailable; // Return the number of copies available
    }

    public String purchaseBook() {
        totalCopiesPurchased += 1; // Increment the total copies purchased by 1
        copiesAvailable -= 1; // Decrement the number of copies available by 1
        return "Purchased Successfully!"; // Return a success message
    }

    public String addCopy(int n) {
        copiesAvailable += n; // Increment the number of copies available by the provided value
        return ("copy added successfully! Total copies available for this BookID is: " + copiesAvailable); // Return a
                                                                                                           // success
                                                                                                           // message
                                                                                                           // with the
                                                                                                           // updated
                                                                                                           // number of
                                                                                                           // copies
                                                                                                           // available
    }

    // Setter methods

    public void changeBookID(int bookID) {
        this.bookID = bookID; // Change the book ID to the provided value
    }

    public void changeBookTitle(String title) {
        this.title = title; // Change the book title to the provided value
    }

    // Display method

    public void display() {
        System.out.println("Book ID: " + bookID); // Print the book ID
        System.out.println("Title: " + title); // Print the book title
        System.out.println("Total number of copies purchased: " + totalCopiesPurchased); // Print the total copies
                                                                                         // purchased
        System.out.println("Copies available: " + copiesAvailable); // Print the number of copies available
    }
}
