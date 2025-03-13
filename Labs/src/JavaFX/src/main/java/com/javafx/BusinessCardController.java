/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: BusinessCardController.java
 * 
 * Description:
 * Lab 22 (Business Card)
 * Build a JavaFX application that is your own digital business card:
    The application must have an image of yourself
    The application must have your name above the image
    The application must contain your current position (student, job title etc)
    The application must contain your contact information (school email)
    Font colors, weights, family, size, can be of your own choosing.
 *
 * Purpose:
 * To practice using JavaFX.   
 */
package com.javafx;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BusinessCardController {
    @FXML
    private ImageView profileImage;

    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResource("/pic.jpg").toExternalForm());
        profileImage.setImage(image);
    }
}