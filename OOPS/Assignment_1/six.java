// Write a program where class contains void show(int) to display the argument
// passed.
// Call the function once with short as actual parameter and again double as
// actual parameter.
// Add another function as void shpw(double). Repeat the calls. Observe the
// outcomes in each case.

abstract class random {
    // Method overloading: show method with int parameter
    public static void show(int x) {
        System.out.println("int is called");
    }

    // Method overloading: show method with double parameter
    public static void show(double y) {
        System.out.println("double is called");
    }
}

public class six {
    public static void main(String args[]) {
        // Declare and initialize variables
        int a = 10;
        short b = 20;
        double c = 30;

        // Call the show method of the random class with 'a' as the argument
        random.show(a); // Output: "int is called"

        // Call the show method of the random class with 'b' as the argument
        // Short is converted to int due to widening conversion
        random.show(b); // Output: "int is called"

        // Call the show method of the random class with 'c' as the argument
        // Double matches exactly, so the show method with a double parameter is called
        random.show(c); // Output: "double is called"
    }
}
