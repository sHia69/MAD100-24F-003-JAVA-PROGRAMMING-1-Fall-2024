/* Author: Kensukeken
 * Date: 2024-11-22
 * File: Main.java
 *
 * Description: This file is a part of System Manager project.
 *
 * Purpose: Define Main class that contains the main method to run the program.
 * */

import java.util.Scanner; // This class is responsible for creating a Scanner.

public class Main {
    // This is the main method that is executed as soon as the program starts.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemManager manager = new SystemManager();
        boolean exit = false;
        // This loop runs until the user chooses to exit the program.
        while (!exit) {
            System.out.println("Welcome to the System Manager!");
            System.out.println("Please select your choice (1-4):" +
                    "\n1) Creation" +
                    "\n2) Retrieval" +
                    "\n3) Deletion" +
                    "\n4) Exit\n");
            int choice = scanner.nextInt();
            scanner.nextLine();
            // This switch statement handles the user's choice.
            switch (choice) {
                case 1:
                    System.out.println("Enter Type (Laptop/Phone/Server): ");
                    String type = scanner.nextLine();
                    System.out.println("Enter Location City: ");
                    String locationCity = scanner.nextLine();
                    System.out.println("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.println("Enter Serial: ");
                    String serial = scanner.nextLine();
                    System.out.println("Enter Purchase Date (YYYY-MM-DD): ");
                    String purchaseDate = scanner.nextLine();

                    if (type.equalsIgnoreCase("Laptop")) {
                        System.out.println("Has LTE Module (yes/no): ");
                        boolean hasLTEModule = scanner.nextLine().equalsIgnoreCase("yes");
                        manager.addSystem(new Laptop(locationCity, model, serial, purchaseDate, hasLTEModule));
                    } else if (type.equalsIgnoreCase("Phone")) {
                        System.out.println("Enter Phone Number: ");
                        String phoneNumber = scanner.nextLine();
                        manager.addSystem(new Phone(locationCity, model, serial, purchaseDate, phoneNumber));
                    } else if (type.equalsIgnoreCase("Server")) {
                        System.out.println("Enter IP Address: ");
                        String ipAddress = scanner.nextLine();
                        manager.addSystem(new Server(locationCity, model, serial, purchaseDate, ipAddress));
                    } else {
                        System.out.println("Invalid Type!");
                    }
                    break;
                case 2:
                    System.out.println("Enter ID to retrieve: ");
                    String retrieveId = scanner.nextLine();
                    SystemRecord retrievedSystem = manager.retrieveSystem(retrieveId);
                    if (retrievedSystem != null) {
                        System.out.println(retrievedSystem);
                    } else {
                        System.out.println("System not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    if (manager.deleteSystem(deleteId)) {
                        System.out.println("System deleted successfully.");
                    } else {
                        System.out.println("System not found!");
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
        scanner.close();
    }
}