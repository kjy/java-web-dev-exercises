package org.launchcode.java.studios.ch4.restaurant;

import java.util.ArrayList;
import java.util.Date;
public class Menu {

    // class variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    // constructors
    public Menu() {
        this.lastUpdated = new Date();
    }

    // methods

    // getters and setters
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }
    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }


    // Other Methods
    public void addMenuItem(MenuItem item) {
        for (MenuItem menuItem : this.menuItems) {
            if (item.equals(menuItem)) {
                // display a warning
                System.out.println("WARNING: This item already exists!!");
                return; // get out of method
            }
        }

        // add to the list of menu items
        this.menuItems.add(item);

        // update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }
    public void removeMenuItem(MenuItem item) {
        // remove the item from the list
        this.menuItems.remove(item);

        // update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        for (MenuItem item : this.menuItems) {
            // menuItem.printOutMenuItem();
            returnString += item.toString() + "\n\n";
        }
        return returnString;
    }
}
