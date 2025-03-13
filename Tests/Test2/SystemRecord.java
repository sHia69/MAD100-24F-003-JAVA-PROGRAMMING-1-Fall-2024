/* Author: Kensukeken
 * Date: 2024-11-22
 * File: SystemRecord.java
 * Description: This file is a part of System Manager project.
 *
 * Purpose: Define SystemRecord class that represents a system record.
 * */

import java.util.UUID; // This class is responsible for generating unique IDs.

// This class represents a system record.
public abstract class SystemRecord {
    private String id;
    private String type;
    private String locationCity;
    private String model;
    private String serial;
    private String purchaseDate;

    // This constructor initializes the system record with the given values.
    public SystemRecord(String type, String locationCity, String model, String serial, String purchaseDate) {
        this.id = generateId();
        this.type = type;
        this.locationCity = locationCity;
        this.model = model;
        this.serial = serial;
        this.purchaseDate = purchaseDate;
    }

    // This method generates a unique ID for the system record.
    private String generateId() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16).toUpperCase();
    }

    // This method returns the ID of the system record.
    public String getId() {
        return id;
    }

    // This method returns the type of the system record.
    public String getType() {
        return type;
    }

    // This method returns the location city of the system record.
    public String getLocationCity() {
        return locationCity;
    }

    // This method returns the model of the system record.
    public String getModel() {
        return model;
    }

    // This method returns the serial of the system record.
    public String getSerial() {
        return serial;
    }

    // This method returns the purchase date of the system record.
    public String getPurchaseDate() {
        return purchaseDate;
    }

    // This method returns a string representation of the system record.
    @Override
    public String toString() {
        return "ID: " + id + "\nType: " + type + "\nLocation City: " + locationCity + "\nModel: " + model + "\nSerial: " + serial + "\nPurchase Date: " + purchaseDate;
    }
}