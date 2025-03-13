/* Author: Kensukeken
 * Date: 2024-11-22
 * File: SystemManager.java
 *
 * Description: This file is a part of System Manager project.
 *
 * Purpose: Define SystemManager class that manages the systems.
 * SystemManager class is responsible for managing the systems.
 * It provides the following functionalities:
 * 1. Add a system
 * 2. Retrieve a system
 * 3. Delete a system
 * 4. Get all systems
 * */

import java.util.ArrayList; // This class is responsible for creating an ArrayList.
import java.util.List; // This class is responsible for creating a List.

// This class manages the systems.
public class SystemManager {
    private List<SystemRecord> systems;

    // This constructor initializes the system manager.
    public SystemManager() {
        systems = new ArrayList<>();
    }

    // This method adds a system to the system manager.
    public void addSystem(SystemRecord system) {
        systems.add(system);
    }

    // This method retrieves a system from the system manager.
    public SystemRecord retrieveSystem(String id) {
        for (SystemRecord system : systems) {
            if (system.getId().equalsIgnoreCase(id)) {
                return system;
            }
        }
        return null;
    }

    //  This method deletes a system from the system manager.
    public boolean deleteSystem(String id) {
        return systems.removeIf(system -> system.getId().equalsIgnoreCase(id));
    }

    // This method returns all systems in the system manager.
    public List<SystemRecord> getAllSystems() {
        return systems;
    }
}