//Write a program that accepts radius of a circle and displays area of the circle. Declare a 
//constant pi equals to 3.14 using OOP concept.

import java.util.Scanner;

public class three {
    public static void main(String args[]) {
        // Declare a constant variable 'pi' and assign it the value 3.14
        final float pi = 3.14f;

        // Declare a variable to store the radius of the circle
        int radius;

        // Create a Scanner object to read input from the user
        Scanner myobj = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter the radius of the circle: ");

        // Read the radius entered by the user and store it in the 'radius' variable
        radius = myobj.nextInt();

        // Calculate the area of the circle using the formula: pi * radius * radius
        float area = pi * radius * radius;

        // Display the calculated area of the circle
        System.out.println("The area of the circle is " + area);

        // Close the Scanner object to release system resources
        myobj.close();
    }
}
