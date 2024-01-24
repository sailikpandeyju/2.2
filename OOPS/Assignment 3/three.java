// 3. Write a program that takes a filename from user and checks whether it exists or not. If it exists then
// check whether it is a directory or not. If it is a directory then show the list of files in it. If it is not a
// directory then show whether it can be read and/or written into.

import java.io.File;
import java.util.Scanner;

public class three {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String path = sc.nextLine();
        File obj1 = new File(path);
        if (obj1.exists()) {// here .exists() returns true if the file or directory exists
            System.out.println("Is it a file? : " + obj1.isFile()); // returns true if it is any
                                                                    // type of file like .txt file
        } else {
            System.out.println("File or directory not available");
        }
        String directory = sc.nextLine();
        File obj2 = new File(directory);
        if (obj2.isDirectory()) {
            System.out.println("It is a directory");// Here "Directory" is a directory but the files inside them are not
            String names[] = obj2.list();
            System.out.println("****************");
            for (int i = 0; i < names.length; i++) {// prints the names of the 4 files inside it
                System.out.println(names[i]);
            }
            System.out.println("****************");
        } else {
            System.out.println("It is not a directory");
        }
        String fileName = sc.nextLine();
        File obj3 = new File(fileName);
        if (obj3.exists()) {// here .exists() returns true if the file or directory exists
            System.out.println("Readable? : " + obj3.canRead()); // returns true if the file is readable
            System.out.println("Writable? : " + obj3.canWrite()); // returns true if it is writable
        } else {
            System.out.println("File does not exists");
        }
    }
}
