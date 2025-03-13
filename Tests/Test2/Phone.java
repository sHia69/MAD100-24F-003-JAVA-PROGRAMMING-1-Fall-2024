/* Author: Kensukeken
 * Date: 2024-11-22
 * File: Phone.java
 *
 * Description: This file is a part of System Manager project.
 *
 * Purpose: Define Phone class that represents a phone record.
 * */
// This class is a subclass of SystemRecord and represents a phone record.
public class Phone extends SystemRecord {
    private String phoneNumber;
    // This constructor initializes the phone record with the given values.
    public Phone(String locationCity, String model, String serial, String purchaseDate, String phoneNumber) {
        super("Phone", locationCity, model, serial, purchaseDate);
        this.phoneNumber = phoneNumber;
    }
    // This method returns the phone number of the phone record.
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // This method returns a string representation of the phone record.
    @Override
    public String toString() {
        return super.toString() + "\nPhone Number: " + phoneNumber;
    }
}