/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: GamePoster.java
 * 
 * Description:
 * GamePoster class
 * This class extends the Poster class and adds a developer field to it.
 * 
 * Purpose:
 * To create a class that extends another class and adds a field to it.
 */
package com.moviegame;

import javafx.scene.image.Image;

public class GamePoster extends Poster {
    private String developer;

    public GamePoster(String title, Image image, String developer) {
        super(title, image);
        this.developer = developer;
    }

    public String getDeveloper() {
        return developer;
    }

    @Override
    public String getAdditionalInfo() {
        return "Developer: " + developer;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}