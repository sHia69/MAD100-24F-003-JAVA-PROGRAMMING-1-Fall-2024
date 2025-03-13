package com.fxexample.firstfx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class EmployeeDirectory extends Application {
    private static final Label nameLabel = new Label("Name: ");
    private static final Text name = new Text();
    private static final Label cyclopsLabel = new Label("Cyclops: ");
    private static final Text cyclops = new Text();
    private static final ImageView employeeImage = new ImageView();

    static{
        nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,26));
        name.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR,26));
        cyclopsLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR,26));
        cyclops.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR,26));
        employeeImage.setFitWidth(522);
        employeeImage.setFitHeight(670);
    }

    private static void updateEmployeeDisplay(Employee emp){
        name.setText(emp.getName());
        Image img = new Image(emp.getImageFile());
        employeeImage.setImage(img);

        if (emp instanceof Minion) {
            cyclopsLabel.setVisible(true);
            cyclops.setVisible(true);
            Minion empMin = (Minion) emp;
            cyclops.setText(empMin.isCyclops()?"Yes":"No");
            //cyclops.setText(((Minion) emp).isCyclops()?"Yes":"No");
        }
        else{
            cyclopsLabel.setVisible(false);
            cyclops.setVisible(false);
            cyclops.setText("");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        ColumnConstraints colOne = new ColumnConstraints();
        colOne.setPercentWidth(35);
        ColumnConstraints colTwo = new ColumnConstraints();
        colTwo.setPercentWidth(35);
        ColumnConstraints colThree = new ColumnConstraints();
        colThree.setPercentWidth(30);
        pane.getColumnConstraints().addAll(colOne,colTwo,colThree);
        Employee firstEmp = GrusEmployees.getGrusEmployees().get(0);

        //updateEmployeeDisplay(firstEmp);
        pane.add(nameLabel,0,0);
        pane.add(name,0,1);
        pane.add(cyclopsLabel,1,0);
        pane.add(cyclops,1,1);
        pane.add(employeeImage,0,2,2,1);
        ListView<Employee> employeeList = new ListView<Employee>();

        employeeList.setItems(FXCollections.observableList(GrusEmployees.getGrusEmployees()));
        employeeList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Employee>() {
            @Override
            public void changed(ObservableValue observableValue, Employee old, Employee newVal) {
                updateEmployeeDisplay(newVal);
            }
        });
        employeeList.getSelectionModel().select(0);
        pane.add(employeeList,2,0,1,3);
        Scene scene = new Scene(pane, 700,800);
        stage.setTitle("Employee Directory");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
