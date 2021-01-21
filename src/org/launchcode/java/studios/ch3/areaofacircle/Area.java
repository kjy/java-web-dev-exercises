package org.launchcode.java.studios.ch3.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius of a circle?");
        double myRadius = scanner.nextDouble();

        // double area = 3.14 * myRadius * myRadius;
        double area = Circle.getArea(myRadius);
        System.out.println("The area of a circle of radius " + myRadius + " is " + area);

    }

}
