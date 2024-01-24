package MemberList;

public class Member {
    private int memberID; // Private variable to store the member ID
    private String memberName; // Private variable to store the member name
    private String DOB; // Private variable to store the date of birth
    private int maxBook; // Private variable to store the maximum number of books a member can issue
    private int numberOfBooksIssued; // Private variable to store the number of books currently issued by the member

    public Member() {
        // Default constructor
    }

    public Member(int memberID, String memeberName, String DOB, int maxBook) {
        this.memberID = memberID; // Initialize the member ID with the provided value
        this.memberName = memeberName; // Initialize the member name with the provided value
        this.DOB = DOB; // Initialize the date of birth with the provided value
        this.maxBook = maxBook; // Initialize the maximum number of books a member can issue with the provided
        // value
        this.numberOfBooksIssued = 0; // Set the number of books currently issued to 0 initially
    }

    // Getter methods

    public int getMemberID() {
        return memberID; // Return the member ID
    }

    public int getMaxBook() {
        return maxBook; // Return the maximum number of books a member can issue
    }

    public int getIssueNumber() {
        return numberOfBooksIssued; // Return the number of books currently issued by the member
    }

    public String issueBook() {
        numberOfBooksIssued += 1; // Increment the number of books currently issued by the member by 1
        return ("Issue successful!"); // Return a success message
    }

    public String returnBook() {
        if (numberOfBooksIssued == 0) { // Check if the member has no books currently issued
            return ("No books purchased. Purchase a book first!"); // Return a message indicating no books are currently
            // issued
        }
        numberOfBooksIssued -= 1; // Decrement the number of books currently issued by the member by 1
        return ("Return Successful"); // Return a success message
    }

    // Display method

    public void display() {
        System.out.println("Member ID: " + memberID); // Print the member ID
        System.out.println("Name: " + memberName); // Print the member name
        System.out.println("Date of Birth: " + DOB); // Print the date of birth
        System.out.println("Number of books currently issued: " + numberOfBooksIssued); // Print the number of books
        // currently issued by the
        // member
    }
}
