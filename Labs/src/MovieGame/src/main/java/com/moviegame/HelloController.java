/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: HelloController.java
 * 
 * Description:
 * This is the controller class for the JavaFX application.
 * 
 * Purpose:
 * To practice using JavaFX.
*/
package com.moviegame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}