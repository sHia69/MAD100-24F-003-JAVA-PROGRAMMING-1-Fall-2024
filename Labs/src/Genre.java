package src;
/* Author: Hia Al Saleh
 * Date: November 15th, 2024
 * File: lab18.java
 * 
 * Description:
 * Lab 18 - (Genre)
 * Build a Genre class that contains the following:
 * Name
 * Description
 * The class should have getters and setters
 * The class should have a no-args constructor
 * The class should have another constructor that allows for all the information to be provided
 * When a Genre is treated as a string it should return the name
 * 
 * Purpose:
 * Practice creating classes and objects.
 */

public class Genre {
    private String name;
    private String description;

    public Genre() {
    }

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return name;
    }
}