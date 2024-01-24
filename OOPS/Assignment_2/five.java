// 5. Design a student class with roll, name and score. Support must be there to set the score. Score is
// non-negative and cannot exceed 100. For invalid score an exception has to be raised. User of set score
// method will decide about the measures to deal with the exception.

import java.lang.Exception;
import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class Student {
    private int roll; // Private variable to store the roll of the student
    private String name; // Private variable to store the name of the student
    private float score; // Private variable to store the score of the student

    Student() {
    }

    Student(int roll, String name, float score) {
        this.roll = roll; // Assign the roll value to the private variable
        this.name = name; // Assign the name value to the private variable
        this.score = score; // Assign the score value to the private variable
    }

    public void setScore(float score) throws MyException {
        if (score < (float) 0) {
            throw (new MyException("Score cannot be non negative")); // Throw an exception if the score is negative
        }
        if (score > (float) 100) {
            throw (new MyException("Score cannot be greater than 100")); // Throw an exception if the score is greater
                                                                         // than 100
        }
        this.score = score; // Assign the score value to the private variable
        System.out.println("Score set was successful"); // Print a success message
    }

    public void display() {
        System.out.println("Roll: " + roll); // Print the roll value
        System.out.println("Name: " + name); // Print the name value
        System.out.println("Score: " + score); // Print the score value
    }
}

public class five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter the roll of the student: ");
        int roll = sc.nextInt(); // Read the roll value from the user
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine(); // Read the name value from the user
        System.out.print("Enter the score of the student: ");
        float score = sc.nextFloat(); // Read the score value from the user
        Student s;
        try {
            if (score < (float) 0) {
                throw (new MyException("Score cannot be non negative")); // Throw an exception if the score is negative
            }
            if (score > (float) 100) {
                throw (new MyException("Score cannot be greater than 100")); // Throw an exception if the score is
                                                                             // greater than 100
            }
            s = new Student(roll, name, score); // Create a new Student object with the provided values
        } catch (MyException e) {
            System.out.println(e.getMessage()); // Print the exception message
            s = new Student(roll, name, (float) 0); // Create a new Student object with a default score of 0
        }
        s.display(); // Display the student details
        System.out.print("Enter the new score of the Student: ");
        float newScore = sc.nextFloat(); // Read the new score value from the user
        try {
            s.setScore(newScore); // Set the new score for the student
        } catch (MyException e) {
            System.out.println(e.getMessage()); // Print the exception message
            System.out.println("Score set unsuccessful"); // Print a failure message
        }
        s.display(); // Display the updated student details
        sc.close(); // Close the Scanner object
    }
}
