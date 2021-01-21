package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {   // public means we can access this from anywhere in that scope
    public static void main(String[] args) {  //void is the return type, means return nothing
        // static means we can call this method directly using class name without
        // creating an instance of that object
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
