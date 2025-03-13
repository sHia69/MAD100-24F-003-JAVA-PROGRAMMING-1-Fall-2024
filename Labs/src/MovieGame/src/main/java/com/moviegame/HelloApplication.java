/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: HelloApplication.java
 * 
 * Description:
 * Lab 23 (Movie/Game Posters)
 * Using JavaFX do the following:
    Build movie and game posters for your favorite movies and games
    Create sub classes to help display each type (with at least one unique property for movie and one for game)
    Allow the user to select which one to display using a ListView
    Make sure to use ImageView and set the font for your title
 *
 * Purpose:
 * To practice using JavaFX and extending classes. 
 */
package com.moviegame;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ListView<Poster> listView = new ListView<>();
        ObservableList<Poster> posters = FXCollections.observableArrayList(
                new MoviePoster("Hidden Figures", new Image("Hidden_Figures.jpg"), "Theodore Melfi"),
                new MoviePoster("The Cat", new Image("The_Cat.jpg"), "Byun Seung-wook"),
                new GamePoster("Geometry Dash", new Image("Geometry_Dash.jpg"), "Robtop Games"),
                new GamePoster("Danganronpa V3", new Image("Danganronpa_V3.jpg"), "Yoshinori Terasawa")
        );
        listView.setItems(posters);

        StackPane displayPane = new StackPane();
        displayPane.setAlignment(Pos.CENTER);

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                VBox vbox = new VBox(10, newValue.getTitleText(), newValue.getImageView());
                vbox.setAlignment(Pos.CENTER);
                displayPane.getChildren().setAll(vbox);
            }
        });

        HBox hbox = new HBox(10, listView, displayPane);
        hbox.setAlignment(Pos.CENTER_LEFT);

        Scene scene = new Scene(hbox, 600, 400);
        stage.setTitle("Movie/Game Posters");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}