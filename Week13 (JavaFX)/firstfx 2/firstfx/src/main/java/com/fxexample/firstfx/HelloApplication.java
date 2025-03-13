package com.fxexample.firstfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Creating the window pane ( layout of the application)
        StackPane pane = new StackPane();
        //Creating a circle, with a radius of 400, border color black and fill color azure
        Circle circle = new Circle();
        circle.setRadius(400);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.AZURE);
        // Add circle to pane
        pane.getChildren().add(circle);
        //Create vertical box container
        VBox vContainer = new VBox();
        //Create text node with name
        Text name = new Text("Franco Iacobacci");
        //Set font of name node
        name.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 46));
        //Set text color of name
        name.setFill(Color.GREEN);
        //Adding text node to container
        vContainer.getChildren().add(name);
        // Create another txt node for title, with font and color
        Text title = new Text("Professor - IT");
        title.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.ITALIC, 36));
        title.setFill(Color.RED);
        //Add title to container
        vContainer.getChildren().add(title);
        //Set container position to center
        vContainer.setAlignment(Pos.CENTER);
        pane.getChildren().add(vContainer);
        //
        Button change = new Button("Click Me");
        vContainer.getChildren().add(change);
        //Add event handling to the button
        change.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if("***********".equals(title.getText())){
                    title.setText("Professor - IT");
                }
                else{
                    title.setText("***********");
                }
            }
        });
        //Create scene
        Scene scene = new Scene(pane, 900,900);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}