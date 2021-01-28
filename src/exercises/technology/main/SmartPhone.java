package exercises.technology.main;

public class SmartPhone extends Computer {

    // CLass Variables (Properties)
    private boolean isConnectedTo5G;

    // constructor
    public SmartPhone(int screenHeight, int screenWidth, String manufactureYear, boolean b) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    // getter
    public boolean getIsConnectedTo5G() { return this.isConnectedTo5G; }

    // Methods
    public void makePhoneCall(String number) {
        System.out.println("Calling: " + number);  // hard to test this, does not return anything
    }

}
