// 2. For every person in an institute details like name, address (consists of premises number, street, city,
// pin and state), phone number, e-mail id are maintained. A person is either a student or a faculty. For
// student roll number and course of study are also be maintained. For faculty employee id, department
// and specialisation are to be stored. One should be able to view the object details and set the attributes.

import java.util.Scanner;

class address_details {
    private int premiseNumber; // private member variable to store premise number
    private String street; // private member variable to store street name
    private String city; // private member variable to store city name
    private int pin; // private member variable to store PIN code
    private String state; // private member variable to store state name

    address_details() {
    }

    address_details(int premiseNumber, String street, String city, int pin, String state) {
        this.premiseNumber = premiseNumber; // initialize premiseNumber with the provided value
        this.street = street; // initialize street with the provided value
        this.city = city; // initialize city with the provided value
        this.pin = pin; // initialize pin with the provided value
        this.state = state; // initialize state with the provided value
    }

    // Address change methods

    public void changePremiseNumber(int premiseNumber) {
        this.premiseNumber = premiseNumber; // change premiseNumber to the provided value
    }

    public void changeStreet(String street) {
        this.street = street; // change street to the provided value
    }

    public void changeCity(String city) {
        this.city = city; // change city to the provided value
    }

    public void changePin(int pin) {
        this.pin = pin; // change pin to the provided value
    }

    public void changeState(String state) {
        this.state = state; // change state to the provided value
    }

    // returning the object as a string by overriding the toString method
    @Override
    public String toString() {
        return ("\nPremise number: " + premiseNumber + "\nStreet: " + street + "\nCity: " + city + "\nPin: " + pin
                + "\nState: " + state); // return a string representation of the address details
    }
}

abstract class member {
    protected String name; // protected member variable to store the name
    protected address_details address; // protected member variable to store the address
    protected long phoneNumber; // protected member variable to store the phone number
    protected String email; // protected member variable to store the email address

    member() {
    }

    member(String name, int premiseNumber, String street, String city, int pin, String state, long phoneNumber,
            String email) {
        this.name = name; // initialize name with the provided value
        this.address = new address_details(premiseNumber, street, city, pin, state); // create a new address_details
                                                                                     // object with the provided address
                                                                                     // details
        this.phoneNumber = phoneNumber; // initialize phoneNumber with the provided value
        this.email = email; // initialize email with the provided value
    }

    // Setter methods

    public void changePhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber; // change phoneNumber to the provided value
    }

    public void changeEmail(String email) {
        this.email = email; // change email to the provided value
    }
}

class student extends member {
    private int roll; // private member variable to store the roll number
    private String courseOfStudy; // private member variable to store the course of study

    student() {
    }

    student(String name, int premiseNumber, String street, String city, int pin, String state, long phoneNumber,
            String email, int roll, String courseOfStudy) {
        super(name, premiseNumber, street, city, pin, state, phoneNumber, email); // call the superclass constructor
        this.roll = roll; // initialize roll with the provided value
        this.courseOfStudy = courseOfStudy; // initialize courseOfStudy with the provided value
    }

    // Setter methods
    public void changeRoll(int roll) {
        this.roll = roll; // change roll to the provided value
    }

    public void changeCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy; // change courseOfStudy to the provided value
    }

    public void display() {
        System.out.println("Name: " + name); // print the name
        System.out.println("Address: " + address); // print the address
        System.out.println("Phone number: " + phoneNumber); // print the phone number
        System.out.println("Email: " + email); // print the email address
        System.out.println("Roll: " + roll); // print the roll number
        System.out.println("Course of Study: " + courseOfStudy); // print the course of study
    }
}

class faculty extends member {
    private int employeeID; // private member variable to store the employee ID
    private String department; // private member variable to store the department name
    private String specialisation; // private member variable to store the specialisation

    faculty() {
    }

    faculty(String name, int premiseNumber, String street, String city, int pin, String state, long phoneNumber,
            String email, int employeeID, String department, String specialisation) {
        super(name, premiseNumber, street, city, pin, state, phoneNumber, email); // call the superclass constructor
        this.employeeID = employeeID; // initialize employeeID with the provided value
        this.department = department; // initialize department with the provided value
        this.specialisation = specialisation; // initialize specialisation with the provided value
    }

    // Setter methods
    public void changeEmployeeID(int employeeID) {
        this.employeeID = employeeID; // change employeeID to the provided value
    }

    public void changeDepartment(String department) {
        this.department = department; // change department to the provided value
    }

    public void changeSpecialisation(String specialisation) {
        this.specialisation = specialisation; // change specialisation to the provided value
    }

    public void display() {
        System.out.println("Name: " + name); // print the name
        System.out.println("Address: " + address); // print the address
        System.out.println("Phone number: " + phoneNumber); // print the phone number
        System.out.println("Email: " + email); // print the email address
        System.out.println("Employee ID: " + employeeID); // print the employee ID
        System.out.println("Department: " + department); // print the department
        System.out.println("Specialisation: " + specialisation); // print the specialisation
    }
}

public class two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // create a Scanner object for user input

        student s = new student("Sailik Pandey", 23, "Nilkantha street", "Jadavpur", 700032, "West Bengal", 80980989,
                "jaisreeram@gmail.com", 132, "Computer science"); // create a student object with initial details

        faculty f = new faculty("SKS sir", 38, "raja subodh chandra mallick rd", "dum dum", 700092, "West Bengal",
                798798798, "sks@gmail.com", 723145, "Computer Science", "Advance OOPS"); // create a faculty object with
                                                                                         // initial details

        System.out.println("Initial Student Details:");
        s.display(); // display initial student details

        System.out.println("\nInitial Faculty Details:");
        f.display(); // display initial faculty details

        // change student address
        s.address.changePremiseNumber(321); // change premiseNumber of student's address
        s.address.changeStreet("New Main St"); // change street of student's address
        s.address.changeCity("New City"); // change city of student's address
        s.address.changePin(789012); // change pin of student's address
        s.address.changeState("New State"); // change state of student's address

        // change faculty address
        f.address.changePremiseNumber(sc.nextInt()); // change premiseNumber of faculty's address using user input
        f.address.changeStreet("New University Ave"); // change street of faculty's address
        f.address.changeCity(sc.nextLine()); // change city of faculty's address using user input
        f.address.changePin(210987); // change pin of faculty's address
        f.address.changeState("New State"); // change state of faculty's address

        // Change student details
        s.changePhoneNumber(1111111111L); // change phone number of student
        s.changeEmail("johnathandoe@example.com"); // change email address of student
        s.changeRoll(2); // change roll number of student
        s.changeCourseOfStudy("Data Science"); // change course of study of student

        // Change faculty details
        f.changePhoneNumber(2222222222L); // change phone number of faculty
        f.changeEmail("janetsmith@example.com"); // change email address of faculty
        f.changeEmployeeID(2002); // change employee ID of faculty
        f.changeDepartment("Data Science"); // change department of faculty
        f.changeSpecialisation("Machine Learning"); // change specialisation of faculty

        System.out.println("\nUpdated Student Details:");
        s.display(); // display updated student details

        System.out.println("\nUpdated Faculty Details:");
        f.display(); // display updated faculty details
        sc.close(); // close the Scanner object
    }
}
