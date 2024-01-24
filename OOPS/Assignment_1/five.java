//Write a program that accepts a String  and assigns it to another. Check the outcome of 
//comparison with == and equals() metho. Take two Strings and put same input for them. Repeat
//equality checking. Observe the outcome.

import java.util.Scanner;

public class five {
    public static void main(String args[]) {
        // Declare variables to store string inputs
        String a, b, c, d;

        // Create a Scanner object to read input from the user
        Scanner myobj = new Scanner(System.in);

        // Read a line of input and store it in variable 'a'
        a = myobj.nextLine();

        // Assign the value of 'a' to variable 'b'
        b = a;

        // Compare if 'a' and 'b' refer to the same object
        System.out.println(a == b); // true because both 'a' and 'b' refer to the same object

        // Compare if the value of 'a' and 'b' strings are equal
        System.out.println(a.equals(b)); // true because the value of both 'a' and 'b' strings are equal

        // Read a line of input and store it in variable 'c'
        c = myobj.nextLine();

        // Read a line of input and store it in variable 'd'
        d = myobj.nextLine();

        // Compare if 'c' and 'd' refer to the same object
        System.out.println(c == d); // false because both 'c' and 'd' refer to two different objects

        // Compare if the value of 'c' and 'd' strings are equal
        System.out.println(c.equals(d)); // true as the value of both the strings are equal

        // Close the Scanner object to release system resources
        myobj.close();
    }
}
