// 7. Take a String input that contains multiple words. Do the following: i) number of times ‘a’ appears ii)
// number of times “and” appears iii) whether it starts with “The” or not iv) put the String into an array of
// characters v) display the tokens in the String (tokens are the substrings separated by space or @ or .)

import java.util.Scanner;

public class seven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("\nEnter a String input that contains multiple words: "); // Prompt the user to enter a
                                                                                     // string
        String s = sc.nextLine(); // Read the input string from the user

        int countA = 0; // Variable to store the count of 'a' characters in the string
        for (int i = 0; i < s.length(); i++) { // Iterate over each character in the string
            if (s.charAt(i) == 'a') { // Check if the character is 'a'
                countA += 1; // Increment the count of 'a' characters
            }
        }
        System.out.println("Number of 'a' present in the String: " + countA); // Print the count of 'a' characters

        int countAND = 0; // Variable to store the count of the word "and" in the string
        for (int i = 0; i < s.length() - 3; i++) { // Iterate over each substring of length 3 in the string
            if (s.substring(i, i + 3).equals("and")) { // Check if the substring is "and"
                countAND += 1; // Increment the count of "and" occurrences
            }
        }
        System.out.println("Number of “and” present in the String: " + countAND); // Print the count of "and"
                                                                                  // occurrences

        System.out.print("Whether it starts with “The” or not: " + (s.substring(0, 3).equals("The"))); // Check if the
                                                                                                       // string starts
                                                                                                       // with "The" and
                                                                                                       // print the
                                                                                                       // result
        System.out.println(); // Print a new line

        char[] arr = new char[s.length()]; // Create a character array to store the characters of the string
        for (int i = 0; i < s.length(); i++) { // Iterate over each character in the string
            arr[i] = s.charAt(i); // Store the character in the array
        }
        System.out.print("The characters in the string are: "); // Print a message
        for (int i = 0; i < s.length(); i++) { // Iterate over each character in the string
            System.out.print("'" + arr[i] + "'" + " "); // Print each character surrounded by single quotes
        }
        System.out.println("\nThe tokens in the String (tokens are the substrings separated by space or @ or .)"); // Print
                                                                                                                   // a
                                                                                                                   // message

        String temp = ""; // Temporary variable to store each token
        for (int i = 0; i < s.length(); i++) { // Iterate over each character in the string
            if (s.charAt(i) != '@' && s.charAt(i) != ' ' && s.charAt(i) != '.') { // Check if the character is not '@',
                                                                                  // ' ', or '.'
                temp += s.charAt(i); // Append the character to the temporary variable
            } else if (temp.isEmpty() == false) { // Check if the temporary variable is not empty
                System.out.println(temp); // Print the current token
                temp = ""; // Reset the temporary variable
            }
        }
        if (temp.isEmpty() == false) { // Check if there is a remaining token in the temporary variable
            System.out.println(temp); // Print the remaining token
        }
        sc.close(); // Close the Scanner object to release resources
    }
}
