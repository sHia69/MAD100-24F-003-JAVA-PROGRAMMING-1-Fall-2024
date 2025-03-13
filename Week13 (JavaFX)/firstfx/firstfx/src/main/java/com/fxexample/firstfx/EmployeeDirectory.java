package com.fxexample.firstfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EmployeeDirectory extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();

        Employee firstEmp = GrusEmployees.getGrusEmployees().get(4);
        Label nameLabel = new Label("Name: ");
        nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,26));
        Text name = new Text(firstEmp.getName());
        name.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR,26));
        pane.add(nameLabel,0,0);
        pane.add(name,0,1);
        Label cyclopsLabel = new Label("Cyclops");
        cyclopsLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,26));
        if (firstEmp instanceof Minion) {
            Text cyclops = new Text(((Minion) firstEmp).isCyclops()?"Yes":"No");
            cyclops.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR,26));
            pane.add(cyclops,1,1);
        }
        pane.add(cyclopsLabel,1,0);

        Scene scene = new Scene(pane, 500,500);
        stage.setTitle("Employee Directory");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
