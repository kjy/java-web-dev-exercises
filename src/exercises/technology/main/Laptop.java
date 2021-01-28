package exercises.technology.main;



public class Laptop extends Computer {

    // Class Variables (properties)
    private boolean isIntelliJOpened;

    // constructor
    public Laptop(int  screenHeight, int  screenWidth, String  manufactureYear) {
        // place super at the top
        super(screenWidth, screenHeight, manufactureYear);
        // create property
        this.isIntelliJOpened = false;
    }

    // constructor
    public Laptop(int screenHeight, int screenWidth, String manufactureYear, boolean isIntelliJOpened) {
        // place super at the top
        super(screenWidth, screenHeight, manufactureYear);
        // create property
        this.isIntelliJOpened = isIntelliJOpened;
    }

    // getter and setter
    public boolean getIsIntelliJOpened() { return this.isIntelliJOpened; }
    public void setIsIntelliJOpened(boolean isIntelliJOpened) { this.isIntelliJOpened = isIntelliJOpened; }

    // Methods
    public void openIntelliJ() {
        this.isIntelliJOpened = true;
        System.out.println("IntelliJ is now opened!");
    }




}
