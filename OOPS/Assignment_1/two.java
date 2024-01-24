//Write a program that accepts number of command line parameters and displays the parameters
//and count of such parameters

public class two {
    public static void main(String args[]) {
        // Retrieve the length of the 'args' array, which contains command line
        // parameters
        int x = args.length;

        // Display the number of command line parameters
        System.out.println("The numbers of parameters are : " + x);

        // Display the label for the command line parameters
        System.out.println("Command line parameters: ");

        // Iterate through each element of the 'args' array
        for (int i = 0; i < x; i++) {
            // Display the current command line parameter
            System.out.println(args[i]);
        }
    }
}
