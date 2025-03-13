/* Author: Kensukeken
 * Date: 2024-11-22
 * File: Server.java
 *
 * Description: This file is a part of System Manager project.
 *
 * Purpose: Define Server class that represents a server record.
 * */
// This class is a subclass of SystemRecord and represents a server record.
public class Server extends SystemRecord {
    private String ipAddress;

    // This constructor initializes the server record with the given values.
    public Server(String locationCity, String model, String serial, String purchaseDate, String ipAddress) {
        super("Server", locationCity, model, serial, purchaseDate);
        this.ipAddress = ipAddress;
    }

    // This method returns the IP address of the server record.
    public String getIpAddress() {
        return ipAddress;
    }

    // This method returns a string representation of the server record.
    @Override
    public String toString() {
        return super.toString() + "\nIP Address: " + ipAddress;
    }
}