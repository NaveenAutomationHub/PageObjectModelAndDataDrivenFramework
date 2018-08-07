package com.qa.java.programs;

import java.io.*;
 
public class OverloadingMainMethod {
     
    // Normal main()
    public static void main(String[] args) {
        System.out.println("Hi  (from main)");
        OverloadingMainMethod.main("Naveen");
    }
 
    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        OverloadingMainMethod.main("Dear Naveen","My Friend");
    }
    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}