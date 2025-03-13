package src;
/* Author: Hia Al Saleh
 * Date: November 15th, 2024
 * File: lab19.java
 * 
 * Description:
 * Lab 19 - (Actor Class)
 * Build an Actor class that contains the following:
 * First Name
 * Last Name
 * Age
 * Description
 * The class should have getters and setters
 * The class should have a no-args constructor
 * The class should have another constructor that allows for all the information to be provided
 * When an actor is treated as a string it should show the actors name
 * 
 * Purpose:
 * Practice creating classes and objects.
 */

 public class Actor {
    private String firstName;
    private String lastName;
    private int age;
    private String description;


    public Actor() {
        
    }

    public Actor(String firstName, String lastName, int age, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
