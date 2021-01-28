package org.launchcode.java.studios.ch4.restaurant;

public class MenuItem {

    // class variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;


    // constructors
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }
    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = false;
    }
    // methods



    // Getters and Setters
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return this.price; }
    public void setPrice(Double price) {this.price = price; }

    public String getCategory() { return this.category; }
    public void setCategory(String category) { this.category = category; }

    // is menu item new
    public Boolean IsNew() { return this.isNew; }
    public void setIsNew(Boolean isNew) { this.isNew = isNew; }

    // Other Methods
    @Override
    public String toString() {
        //printOutMenuItem()
        String returnString = "";

        // print itemName
        returnString += "Item Name: " + this.name + "\n";
        // print itemDescription
        returnString += "Item Description: " + this.description + "\n";
        // print itemPrice
        returnString += "Item Price: " + this.price + "\n";
        // print itemCategory
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item Is New?: " + this.isNew  + "\n";

        return returnString;
    }
    @Override
    public boolean equals(Object obj) {
        // Does object from parameter have the same memory address? If yes, same object.
        if (obj == this) return true;
        // Check if menuItem is not a MenuItem
        if (!(obj instanceof MenuItem)) return false;

        // cast obj as class MenuItem
        MenuItem menuItem  = (MenuItem) obj;
        // if itemName equals menuItem.itemName
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category)) {
            return true;
        } else return false;
    }

}
