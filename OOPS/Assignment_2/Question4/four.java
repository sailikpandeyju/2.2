// 4. Consider the packages designed in previous question. Design an interface to ensure that the library
// management must have the option i) add book ii) search book iii) view all book iv) add member v)
// search a member vii) view all members viii) issue book ix) return book.
// Design the system by implementing the interface.

import BookList.Book; // Importing the Book class from the BookList package
import MemberList.Member; // Importing the Member class from the MemberList package
import TransactionList.Transaction; // Importing the Transaction class from the TransactionList package

import java.util.ArrayList; // Importing the ArrayList class from the Java util package
import java.util.Scanner; // Importing the Scanner class from the Java util package

interface libraryInterface { // Defining an interface named libraryInterface
    public void addBook(); // Declaring a method addBook() without an implementation

    public void addCopy(); // Declaring a method addCopy() without an implementation

    public void showAllBookDetails(); // Declaring a method showAllBookDetails() without an implementation

    public void showBook(); // Declaring a method showBook() without an implementation

    public void addMember(); // Declaring a method addMember() without an implementation

    public void showAllMemberDetails(); // Declaring a method showAllMemberDetails() without an implementation

    public void showMember(); // Declaring a method showMember() without an implementation

    public void issueBook(); // Declaring a method issueBook() without an implementation

    public void returnBook(); // Declaring a method returnBook() without an implementation
}

class Library implements libraryInterface {
    private ArrayList<Book> b; // ArrayList to store books
    private ArrayList<Member> m; // ArrayList to store members
    private ArrayList<Transaction> t; // ArrayList to store transactions
    private int numberOfBooks; // Number of books in the library
    private int numberOfMembers; // Number of members in the library
    private int numberOfTransactions; // Number of transactions in the library

    Library() {
        this.numberOfBooks = 0; // Initializing the number of books to 0
        this.numberOfMembers = 0; // Initializing the number of members to 0
        this.numberOfTransactions = 0; // Initializing the number of transactions to 0
        b = new ArrayList<Book>(); // Creating a new ArrayList for books
        m = new ArrayList<Member>(); // Creating a new ArrayList for members
        t = new ArrayList<Transaction>(); // Creating a new ArrayList for transactions
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter Book ID: "); // Prompting the user to enter the book ID
        int bookID = sc.nextInt(); // Reading the book ID from the user
        for (int i = 0; i < numberOfBooks; i++) {
            Book tempBook = b.get(i); // Getting the book at index i from the book ArrayList
            if (tempBook.getBookID() == bookID) {
                System.out.println("Duplicate Book ID found!"); // Displaying an error message if the book ID is
                // duplicate
                return; // Exiting the method
            }
        }
        sc.nextLine();
        System.out.println("Enter Book Title: "); // Prompting the user to enter the book title
        String title = sc.nextLine(); // Reading the book title from the user
        System.out.println("Enter the number of copies of this book: "); // Prompting the user to enter the number of
        // copies available
        int totalCopiesAvailable = sc.nextInt(); // Reading the number of copies available from the user
        Book newBook = new Book(bookID, title, totalCopiesAvailable); // Creating a new Book object with the provided
        // details
        b.add(newBook); // Adding the new book to the book ArrayList
        System.out.println("Book added successfully"); // Displaying a success message
        numberOfBooks += 1; // Incrementing the number of books by 1
    }

    public void addCopy() {
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter Book ID: "); // Prompting the user to enter the book ID
        int bookID = sc.nextInt(); // Reading the book ID from the user
        for (int i = 0; i < numberOfBooks; i++) {
            Book tempBook = b.get(i); // Getting the book at index i from the book ArrayList
            if (tempBook.getBookID() == bookID) {
                System.out.println("Enter number of copies you want to add: "); // Prompting the user to enter the
                // number of copies to add
                System.out.println(tempBook.addCopy(sc.nextInt())); // Adding the specified number of copies to the book
                // and displaying the updated total copies

                return; // Exiting the method
            }
        }

        System.out.println("Book ID not found!"); // Displaying an error message if the book ID is not found
    }

    public void showAllBookDetails() {
        for (int i = 0; i < numberOfBooks; i++) {
            Book tempBook = b.get(i); // Getting the book at index i from the book ArrayList
            tempBook.display(); // Displaying the details of the book
        }
    }

    public void showBook() {
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter the ID of the book: "); // Prompting the user to enter the book ID
        int bookID = sc.nextInt(); // Reading the book ID from the user
        for (int i = 0; i < numberOfBooks; i++) {
            Book tempBook = b.get(i); // Getting the book at index i from the book ArrayList
            if (tempBook.getBookID() == bookID) {
                tempBook.display(); // Displaying the details of the book

                return; // Exiting the method
            }
        }
        System.out.println("Book ID not found!"); // Displaying an error message if the book ID is not found
    }

    public void addMember() {
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter Member ID: "); // Prompting the user to enter the member ID
        int memberID = sc.nextInt(); // Reading the member ID from the user
        for (int i = 0; i < numberOfMembers; i++) {
            Member tempMember = m.get(i); // Getting the member at index i from the member ArrayList
            if (tempMember.getMemberID() == memberID) {
                System.out.println("Duplicate Member ID found!"); // Displaying an error message if the member ID is
                // duplicate

                return; // Exiting the method
            }
        }
        sc.nextLine();
        System.out.println("Enter member name: "); // Prompting the user to enter the member name
        String memberName = sc.nextLine(); // Reading the member name from the user
        System.out.println("Enter member Date of Birth: "); // Prompting the user to enter the member's date of birth
        String DOB = sc.nextLine(); // Reading the member's date of birth from the user
        System.out.println("Enter the max number of books that can be allotted: "); // Prompting the user to enter the
        // maximum number of books that can
        // be allotted
        int maxBook = sc.nextInt(); // Reading the maximum number of books from the user
        Member newMember = new Member(memberID, memberName, DOB, maxBook); // Creating a new Member object with the
        // provided details
        m.add(newMember); // Adding the new member to the member ArrayList
        System.out.println("Member added successfully"); // Displaying a success message
        numberOfMembers += 1; // Incrementing the number of members by 1
    }

    public void showAllMemberDetails() {
        for (int i = 0; i < numberOfMembers; i++) {
            Member tempMember = m.get(i); // Getting the member at index i from the member ArrayList
            tempMember.display(); // Displaying the details of the member
        }
    }

    public void showMember() {
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter the ID of the Member: "); // Prompting the user to enter the member ID
        int memberID = sc.nextInt(); // Reading the member ID from the user
        for (int i = 0; i < numberOfMembers; i++) {
            Member tempMember = m.get(i); // Getting the member at index i from the member ArrayList
            if (tempMember.getMemberID() == memberID) {
                tempMember.display(); // Displaying the details of the member

                return; // Exiting the method
            }
        }
        System.out.println("Member ID not found!"); // Displaying an error message if the member ID is not found
    }

    public void issueBook() {
        System.out.println("*******************BOOK ISSUE*******************"); // Displaying a book issue header
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter the desired Book ID: "); // Prompting the user to enter the book ID
        int bookID = sc.nextInt(); // Reading the book ID from the user
        int availableBook = 0; // Flag to check if the book is available
        int bookIndex = -1; // Index of the book in the book ArrayList

        for (int i = 0; i < numberOfBooks; i++) {
            Book tempBook = b.get(i); // Getting the book at index i from the book ArrayList
            if (tempBook.getBookID() == bookID) {
                if (tempBook.getCopiesAvailable() > 0) {
                    bookIndex = i; // Storing the index of the available book
                    availableBook = 1; // Marking the book as available
                    break;
                } else {
                    System.out.println("All the copies of this book have been sold!"); // Displaying an error message if
                    // all copies of the book are
                    // sold

                    return; // Exiting the method
                }
            }
        }

        if (availableBook == 0) {
            System.out.println("Book not found! Please enter correct Book ID"); // Displaying an error message if the
            // book is not found
            return; // Exiting the method
        }

        System.out.println("Enter the Member ID"); // Prompting the user to enter the member ID
        int memberID = sc.nextInt(); // Reading the member ID from the user
        int availableMember = 0; // Flag to check if the member is available
        int memberIndex = -1; // Index of the member in the member ArrayList

        for (int i = 0; i < numberOfMembers; i++) {
            Member tempMember = m.get(i); // Getting the member at index i from the member ArrayList
            if (tempMember.getMemberID() == memberID) {
                if (tempMember.getIssueNumber() < tempMember.getMaxBook()) {
                    availableMember = 1; // Marking the member as available
                    memberIndex = i; // Storing the index of the available member
                    break;
                } else {
                    System.out.println("Max number of books issued! Please return a book first!"); // Displaying an
                    // error message if
                    // the member has
                    // reached the
                    // maximum number of
                    // books issued

                    return; // Exiting the method
                }
            }
        }

        if (availableMember == 0) {
            System.out.println("Member not found! Please enter a correct Member ID"); // Displaying an error message if
            // the member is not found
            return; // Exiting the method
        }

        Transaction tempTransaction = new Transaction(memberID, bookID); // Creating a new transaction object with the
        // member and book IDs
        t.add(tempTransaction); // Adding the transaction to the transaction ArrayList
        numberOfTransactions += 1; // Incrementing the number of transactions

        System.out.println(b.get(bookIndex).purchaseBook() + "\n" + m.get(memberIndex).issueBook()); // Displaying the
        // purchase and
        // issue details of
        // the book and
        // member
        // respectively
    }

    public void returnBook() {
        System.out.println("*******************BOOK RETURN*******************"); // Displaying a book return header
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        System.out.println("Enter the Book ID: "); // Prompting the user to enter the book ID
        int bookID = sc.nextInt(); // Reading the book ID from the user
        System.out.println("Enter the Member ID: "); // Prompting the user to enter the member ID
        int memberID = sc.nextInt(); // Reading the member ID from the user

        int transactionIndex = -1; // Index of the transaction in the transaction ArrayList

        for (int i = 0; i < numberOfTransactions; i++) {
            Transaction tempTransaction = t.get(i); // Getting the transaction at index i from the transaction ArrayList
            if (tempTransaction.getBookID() == bookID && tempTransaction.getMemberID() == memberID) {
                transactionIndex = i; // Storing the index of the transaction
                break;
            }
        }

        if (transactionIndex == -1) {
            System.out.println("No such transaction found! Please enter valid transaction details"); // Displaying an
            // error message if
            // the transaction
            // is not found

            return; // Exiting the method
        }

        t.get(transactionIndex).changeTransactionMemberID(-1); // Changing the transaction member ID to -1
        for (int i = 0; i < numberOfBooks; i++) {
            Book tempBook = b.get(i); // Getting the book at index i from the book ArrayList
            if (tempBook.getBookID() == bookID) {
                System.out.println(tempBook.addCopy(1)); // Adding a copy of the book
                break;
            }
        }

        for (int i = 0; i < numberOfMembers; i++) {
            Member tempMember = m.get(i); // Getting the member at index i from the member ArrayList
            if (tempMember.getMemberID() == memberID) {
                System.out.println(tempMember.returnBook()); // Returning the book
                break;
            }
        }
    }

}

public class four {
    public static void main(String args[]) {
        Library l = new Library(); // Creating a new Library object
        Scanner sc = new Scanner(System.in); // Creating a new Scanner object to read input
        while (true) {
            System.out.println("************************"); // Displaying the menu options
            System.out.println("1. Add new book in booklist");
            System.out.println("2. Add more copies for a book");
            System.out.println("3. Show all book details");
            System.out.println("4. Show details of a book");
            System.out.println("5. Add member in the list");
            System.out.println("6. Show all members");
            System.out.println("7. Show details of a member");
            System.out.println("8. Issue a book");
            System.out.println("9. Return book");
            System.out.println("************************");
            System.out.print("Enter your choice: "); // Prompting the user to enter their choice
            int n = sc.nextInt(); // Reading the user's choice

            switch (n) { // Switching based on the user's choice
                case 1:
                    l.addBook(); // Calling the addBook() method of the Library object
                    break;
                case 2:
                    l.addCopy(); // Calling the addCopy() method of the Library object
                    break;
                case 3:
                    l.showAllBookDetails(); // Calling the showAllBookDetails() method of the Library object
                    break;
                case 4:
                    l.showBook(); // Calling the showBook() method of the Library object
                    break;
                case 5:
                    l.addMember(); // Calling the addMember() method of the Library object
                    break;
                case 6:
                    l.showAllMemberDetails(); // Calling the showAllMemberDetails() method of the Library object
                    break;
                case 7:
                    l.showMember(); // Calling the showMember() method of the Library object
                    break;
                case 8:
                    l.issueBook(); // Calling the issueBook() method of the Library object
                    break;
                case 9:
                    l.returnBook(); // Calling the returnBook() method of the Library object
                    break;
                default:
                    return; // Exiting the program if an invalid choice is entered
            }
        }
    }
}