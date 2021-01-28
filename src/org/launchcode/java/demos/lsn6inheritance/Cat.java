package org.launchcode.java.demos.lsn6inheritance;

public class Cat {
//public abstract class Cat {

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;

    // The biological family for all cat species
    // family is not accessible by class HouseCat but may be read via the public getter getFamily
    private String family = "Felidae";

    public Cat (double aWeight) {
        weight = aWeight;
    }
    public Cat () {
        weight = 13;
    }

    /**** Getters and Setters ****/

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean aTired) {
        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {
        hungry = aHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double aWeight) {
        weight = aWeight;
    }

    // There is no setter family. It may only be set within Cat class.
    // Subclass should not be able to change the biological family of a cat
    public String getFamily() {
        return family;
    }

    /**** Instance Methods ****/

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

    public String noise () {
        return "Meeeeeeooooowww!";
    }

    // public abstract String noise();

}
