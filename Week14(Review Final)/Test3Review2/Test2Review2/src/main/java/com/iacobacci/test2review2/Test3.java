package com.iacobacci.test2review2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Test3 extends Application {

    private Text questionText = new Text();
    private VBox answerBlock = new VBox();
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        /* create a gui for a test, with multiple questions have 2 question types,
        multiple choice, and fill in the blank */
        ColumnConstraints colOne = new ColumnConstraints();
        ColumnConstraints colTwo = new ColumnConstraints();
        colOne.setPercentWidth(70);
        colTwo.setPercentWidth(30);
        pane.getColumnConstraints().addAll(colOne,colTwo);
        pane.add(questionText,0,0);
        pane.add(answerBlock,0,1);

        ListView<Question> questions = new ListView<>();
        questions.setItems(FXCollections.observableList(Test3Questions.getTest3Questions()));
        pane.add(questions,1,0,1,2);
        questions.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Question>() {
            @Override
            public void changed(ObservableValue<? extends Question> observableValue, Question old, Question newq) {
                updateQuestionDisplay(newq);
            }
        });

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Test 3 Review");
        stage.setScene(scene);
        stage.show();
    }
    private void updateQuestionDisplay(Question q){
        questionText.setText(q.getQuestionText());
        answerBlock.getChildren().removeAll(answerBlock.getChildren());

        if(q instanceof FillInTheBlank){
            TextField field = new TextField();
            field.setText(q.getAnswer());
            field.setOnKeyReleased(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    ((FillInTheBlank) q).setAnswer(field.getText());
                }
            });

            answerBlock.getChildren().add(field);
        }
        else if(q instanceof MultipleChoice){
            for(int i =0; i<((MultipleChoice) q).getPotentialAnswers().size();i++){
                String pAns=((MultipleChoice) q).getPotentialAnswers().get(i);
                Button ans = new Button(pAns);
                final int answerVal = i;
                if(i==((MultipleChoice) q).getSelectedAnswer()){
                    ans.setTextFill(Color.GREEN);

                }
                ans.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        ((MultipleChoice) q).setSelectedAnswer(answerVal);
                        updateQuestionDisplay(q);
                    }
                });
                answerBlock.getChildren().add(ans);
            }
        }
    }
    public static void main(String[] args) {
        launch();
    }
}