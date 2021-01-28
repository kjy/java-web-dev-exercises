package org.launchcode.java.demos.lsn6inheritance;
import org.launchcode.java.demos.lsn6inheritance.Main;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;


public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        // Cat salem = new Cat(8);  Cat is abstract class; cannot be instantiated

        Cat suki = new HouseCat("Suki", 8);

        // Calls HouseCat's noise() method
        suki.noise(); // Hello, my name is Suki!

        // As long as suki really is a HouseCat, this works
        ((HouseCat) suki).isSatisfied();
    }
}
