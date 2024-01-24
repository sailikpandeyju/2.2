// 6. Consider a wrapper class for a numeric basic type. Check the support for the following: conversion
// from i) basic type to object ii) object to basic type iii) basic type to String iv) String (holding numeric
// data) to numeric object v) object to String.

public class six {
        public static void main(String args[]) {
                int i1 = 30; // Declare and initialize an integer variable

                // i) basic type to object
                Integer wi = Integer.valueOf(i1); // Convert the basic type int to the Integer wrapper class
                System.out.println("Basic to wrapper class conversion: int to Integer: " + wi + "    |    "
                                + wi.getClass());

                // ii) object to basic type
                int i2 = wi.intValue(); // Convert the Integer object back to the basic type int
                System.out.println("Wrapper class to Basic data type conversion: Integer to int: " + i2 + "    |    "
                                + "Here int -> basic data type");

                // iii) basic type to String
                float f1 = (float) 20.35; // Declare and initialize a float variable
                String s1 = Float.toString(f1); // Convert the float to a String
                System.out.println("Basic data type to String conversion: float to String: " + s1 + "    |    "
                                + s1.getClass());

                // iv) String (holding numeric data) to numeric object
                float f2 = Float.valueOf(s1); // Convert the numeric data stored in a String back to float
                System.out.println(
                                "String (holding numeric data) to numeric object: String to float: " + f2 + "    |    "
                                                + "Here float -> basic data type");
                Float f3 = Float.valueOf(s1); // Convert the numeric data stored in a String to Float wrapper class
                System.out.println(
                                "String (holding numeric data) to numeric object: String to float: " + f3 + "    |    "
                                                + "Here float -> Wrapper class");

                // v) object to String.
                Double d1 = 53.69; // Declare and initialize a Double wrapper class object
                String s2 = Double.toString(d1); // Convert the Double object to a String
                System.out.println("Wrapper class object to String: Double to String: " + s2 + "    |    "
                                + s1.getClass());
        }
}
