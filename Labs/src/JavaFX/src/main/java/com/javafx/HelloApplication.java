/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: HelloApplication.java
 * 
 * Description:
 * This is the main class for the JavaFX application.
 * 
 * Purpose:
 * To practice using JavaFX.
 */
package com.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/javafx/business-card.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 400);
        stage.setTitle("Business Card");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}