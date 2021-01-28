package org.launchcode.java.studios.ch4.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Delicious Desserts", 7.50, "Unhealthy", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);// should have warning message of THis item already exists!! duplicated
        myMenu.addMenuItem(item3);

//        myMenu.removeMenuItem(item3);

        System.out.println(myMenu.toString());


//        // Test out the tostring method
//        System.out.println(item1.toString());

//        // Test out the equals method
//        System.out.println(item1.equals(item2));
//        System.out.println(item1.equals(item3));
    }
}
