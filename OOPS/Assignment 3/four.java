//4. Write a program to create a text file to store a list of names and then read the content.

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class four {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of names to be entered
        System.out.println("Enter the number of names you want to enter: ");
        int size = sc.nextInt();

        // Create an array to store the names
        String names[] = new String[size];
        sc.nextLine();

        // Read the names from the user and store them in the array
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        // Open a FileWriter to write the names to a file
        FileWriter fw = new FileWriter("fourNames.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        // Write each name to the file
        for (int i = 0; i < size; i++) {
            pw.println(names[i]);
        }

        // Close the PrintWriter, BufferedWriter, and FileWriter
        pw.close();
        bw.close();
        fw.close();
        System.out.println("The names are successfully written to the file");

        // Read the names from the file
        System.out.println("*******Reading names from the file******");

        // Open a FileReader to read the names from the file
        FileReader fr = new FileReader("fourNames.txt");
        BufferedReader br = new BufferedReader(fr);
        String text;

        // Read each line from the file and print it
        while ((text = br.readLine()) != null) {
            System.out.println(text);
        }

        // Close the BufferedReader and FileReader
        br.close();
        fr.close();
        System.out.println("******************");

        // Close the Scanner
        sc.close();
    }
}
