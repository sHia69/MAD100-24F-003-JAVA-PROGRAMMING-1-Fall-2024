/* Author: Kensukeken
 * Date: 2024-11-22
 * File: Laptop.java
 *
 * Description: This file is a part of System Manager project.
 *
 * Purpose: Define Laptop class that represents a laptop record.
 * */
// This class is a subclass of SystemRecord and represents a laptop record.
public class Laptop extends SystemRecord {
    private boolean hasLTEModule;

    // This constructor initializes the laptop record with the given values.
    public Laptop(String locationCity, String model, String serial, String purchaseDate, boolean hasLTEModule) {
        super("Laptop", locationCity, model, serial, purchaseDate);
        this.hasLTEModule = hasLTEModule;
    }

    // This method returns whether the laptop has an LTE module.
    public boolean hasLTEModule() {
        return hasLTEModule;
    }

    // This method returns a string representation of the laptop record.
    @Override
    public String toString() {
        return super.toString() + "\nHas LTE Module: " + (hasLTEModule ? "Yes" : "No");
    }
}