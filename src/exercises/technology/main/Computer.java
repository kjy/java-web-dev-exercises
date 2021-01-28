package exercises.technology.main;

public class Computer extends AbstractEntity {
    // need 3 properties, 2 methods, and a constructor
    // properties
    private int screenWidth;
    private int screenHeight;
    private String manufactureYear;

    // constructor
    public Computer (int screenWidth, int screenHeight, String manufactureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;
    }

    // methods
    public int processTwoPlusTwo() {
        return 2 + 2;
    }

    // getters
    public int getScreenWidth() { return this.screenWidth; }
    public int getScreenHeight() { return this.screenHeight; }
    public String getManufactureYear() {return this.manufactureYear; }

    // other methods
    public void tellMeAJoke() {
        System.out.println("Why did the computer show up at work late?  It had a hard drive!");
    }
}
