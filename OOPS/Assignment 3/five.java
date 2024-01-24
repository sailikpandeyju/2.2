// 5. Student class contains roll, name and score. Write a program to store the objects in a file and
// thereafter read all the objects.

import java.io.*;
import java.util.Scanner;

/**
 * The Student class represents a student with name, roll number, and score.
 * It implements the Serializable interface to enable object serialization.
 */
class Student implements Serializable {
    private String name; // Name of the student
    private int roll; // Roll number of the student
    private float score; // Score of the student

    /**
     * Default constructor for the Student class.
     */
    Student() {
    }

    /**
     * Parameterized constructor for the Student class.
     *
     * @param name  The name of the student.
     * @param roll  The roll number of the student.
     * @param score The score of the student.
     */
    Student(String name, int roll, float score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }

    /**
     * Displays the information of the student.
     */
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Score: " + score);
    }
}

/**
 * The 'five' class is the main class that contains the main method to run the
 * program.
 */
public class five {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of student data to be entered
        System.out.print("Enter the number of students data you want to enter: ");
        int size = sc.nextInt();

        // Create a new file and prepare to write objects into it
        FileOutputStream fos = new FileOutputStream("fiveStudents.dat", false);
        ObjectOutputStream dos = new ObjectOutputStream(fos);

        System.out.println("*****Writing into the file*****");
        System.out.println();
        for (int i = 0; i < size; i++) {
            sc.nextLine();

            // Prompt the user to enter student details
            System.out.print("Enter the student name: ");
            String name = sc.nextLine();
            System.out.print("Enter the roll of the student: ");
            int roll = sc.nextInt();
            System.out.print("Enter the score of the student: ");
            float score = sc.nextFloat();
            System.out.println();

            // Create a Student object with the entered data and write it to the file
            Student temp = new Student(name, roll, score);
            dos.writeObject(temp);
        }
        System.out.println("***Data have been written to the file successfully!***");

        // Close the output streams
        dos.close();
        fos.close();

        System.out.println("******Reading files from the file******");

        // Open the file and prepare to read objects from it
        FileInputStream fis = new FileInputStream("fiveStudents.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for (int i = 0; i < size; i++) {
            // Read a Student object from the file
            Student temp = (Student) ois.readObject();

            // Display the student information
            temp.display();
            System.out.println("************************");
        }

        // Close the input streams
        ois.close();
        fis.close();
        sc.close();
    }
}
