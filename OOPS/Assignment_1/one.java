//Write a program that accepts two short integers from the user and display the sum

import java.util.Scanner;

public class one {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner myobj = new Scanner(System.in);

        // Declare two variables of type short to store the input numbers
        short a, b;

        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");

        // Read the first number entered by the user and store it in variable 'a'
        a = myobj.nextShort();

        // Read the second number entered by the user and store it in variable 'b'
        b = myobj.nextShort();

        // Calculate the sum of 'a' and 'b' and store it in variable 'c'
        short c = (short) (a + b);

        // Display the sum of 'a' and 'b'
        System.out.println("The sum of a and b is : " + c);

        // Close the Scanner object to release system resources
        myobj.close();
    }
}
