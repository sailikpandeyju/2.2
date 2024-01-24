//For a programme(such as BCSE), each Instructor has name and phone number. Each textbook
//has a title, author name and publisher. Each course(that is, subject) has a course name,
//instructor and text book.

//One can set the data for a textbook and view the same.
//One can view instructor information and set the information
// One can set the course data and view the same.

//Design and implement the classes

import java.util.Scanner;

class Instructor {
    private String name;
    private int phoneNumber;

    Instructor() {
    }

    // Constructor to initialize the Instructor object with name and phone number
    Instructor(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Method to display the Instructor information
    public void display() {
        System.out.println("Name of the Instructor: " + name);
        System.out.println("Phone number: " + phoneNumber);
    }
}

class TextBook {
    private String title;
    private String author;
    private String publisher;

    TextBook() {
    }

    // Constructor to initialize the TextBook object with title, author, and
    // publisher
    TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Method to display the TextBook information
    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

}

class Course {
    private String courseName;
    private Instructor in;
    private TextBook b;

    Course() {
    }

    // Constructor to initialize the Course object with course name, instructor, and
    // textbook
    Course(String courseName) {
        this.courseName = courseName;
        this.setInstructor();
        this.setTextBook();
    }

    // Method to set the instructor for the course
    private void setInstructor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the instructor: ");
        String name = sc.nextLine();
        System.out.print("Enter the phone number: ");
        int phoneNumber = sc.nextInt();
        this.in = new Instructor(name, phoneNumber);
        sc.nextLine();
    }

    // Method to set the textbook for the course
    private void setTextBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Title of the Book: ");
        String title = sc.nextLine();
        System.out.print("Enter the Author of the Book: ");
        String author = sc.nextLine();
        System.out.print("Enter the publisher name: ");
        String publisher = sc.nextLine();
        this.b = new TextBook(title, author, publisher);
    }

    // Method to display the Course information
    public void display() {
        System.out.println("********************************");
        System.out.println("Course Name: " + courseName);
        in.display();
        b.display();
        System.out.println("********************************");
    }
}

public class ten {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Creating a Course object
        System.out.print("Enter the name of the course: ");
        String courseName = sc.nextLine();
        Course course = new Course(courseName);
        // Displaying the Course information
        course.display();

        sc.close();
    }
}
