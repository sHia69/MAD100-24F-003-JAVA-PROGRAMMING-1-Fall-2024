/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: MoviePoster.java
 * 
 * Description:
 * MoviePoster class
 * This class extends the Poster class and adds a director field to it.
 * 
 * Purpose:
 * To create a class that extends another class and adds a field to it.
 */
package com.moviegame;

import javafx.scene.image.Image;

public class MoviePoster extends Poster {
    private String director;

    public MoviePoster(String title, Image image, String director) {
        super(title, image);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String getAdditionalInfo() {
        return "Director: " + director;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}