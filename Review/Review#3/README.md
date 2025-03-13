# Test 3 Review Notes

This document provides an overview of the classes and functionality in the provided Java files, with code examples and detailed comments to help you prepare for your final exam.

---

## **1. Question Class Hierarchy**

### **1.1 Question (Base Class)**
- **Purpose**: Represents a generic question.
- **Key Features**:
  - Abstract class with an abstract method `getAnswer()`.
  - Handles question text and number.

#### **Code Example**:
```java
public abstract class Question {
    private int questionNumber; // Unique number assigned to the question
    private String questionText; // Text of the question

    public abstract String getAnswer(); // Abstract method to get the answer

    public String getQuestionText() {
        return questionText; // Returns the question text
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText; // Sets the question text
    }

    public int getQuestionNumber() {
        return questionNumber; // Returns the question number
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber; // Sets the question number
    }

    @Override
    public String toString() {
        // Constructs a string representation of the question
        String out = "Question " + questionNumber;
        if (getAnswer() != null) {
            out += " = " + getAnswer();
        }
        return out;
    }
}
```

---

### **1.2 MultipleChoice (Derived Class)**
- **Purpose**: Represents a multiple-choice question.
- **Key Features**:
  - Manages potential answers and the selected answer index.
  - Overrides `getAnswer()` to return the selected answer.

#### **Code Example**:
```java
public class MultipleChoice extends Question {
    private List<String> potentialAnswers; // List of possible answers
    private int selectedAnswer = -1; // Index of the selected answer, -1 if not selected

    @Override
    public String getAnswer() {
        // Returns the selected answer text or null if none is selected
        if (selectedAnswer > -1) {
            return potentialAnswers.get(selectedAnswer);
        }
        return null;
    }

    public List<String> getPotentialAnswers() {
        return potentialAnswers; // Returns the list of potential answers
    }

    public void setPotentialAnswers(List<String> potentialAnswers) {
        this.potentialAnswers = potentialAnswers; // Sets the potential answers
    }

    public int getSelectedAnswer() {
        return selectedAnswer; // Returns the index of the selected answer
    }

    public void setSelectedAnswer(int selectedAnswer) {
        this.selectedAnswer = selectedAnswer; // Sets the index of the selected answer
    }
}
```

---

### **1.3 FillInTheBlank (Derived Class)**
- **Purpose**: Represents a fill-in-the-blank question.
- **Key Features**:
  - Stores the user's answer.
  - Overrides `getAnswer()` to return the provided answer.

#### **Code Example**:
```java
public class FillInTheBlank extends Question {
    private String answer = null; // Stores the user's answer

    @Override
    public String getAnswer() {
        return answer; // Returns the stored answer
    }

    public void setAnswer(String answer) {
        this.answer = answer; // Sets the user's answer
    }
}
```

---

## **2. Test 3 GUI Application**

### **2.1 Overview**
- **Purpose**: Provides a GUI for conducting a test with multiple-choice and fill-in-the-blank questions.
- **Built Using**: JavaFX.

### **2.2 Key Components**
- `Text questionText`: Displays the question text.
- `VBox answerBlock`: Displays input elements (buttons for multiple-choice or text fields for fill-in-the-blank).
- `ListView<Question> questions`: Lists all questions for selection.

#### **Code Example**:
```java
public class Test3 extends Application {
    private Text questionText = new Text(); // Text node to display the question text
    private VBox answerBlock = new VBox(); // Container for answer options or input fields

    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane(); // Layout for arranging components
        pane.add(questionText, 0, 0); // Add the question text at the top left
        pane.add(answerBlock, 0, 1); // Add the answer block below the question text

        ListView<Question> questions = new ListView<>(); // List view to display questions
        questions.setItems(FXCollections.observableList(Test3Questions.getTest3Questions())); // Populate the list
        pane.add(questions, 1, 0, 1, 2); // Add the list view to the right

        // Listener to update the display when a new question is selected
        questions.getSelectionModel().selectedItemProperty().addListener((observable, oldQ, newQ) -> updateQuestionDisplay(newQ));

        Scene scene = new Scene(pane, 500, 500); // Create the scene with the layout
        stage.setTitle("Test 3 Review"); // Set the window title
        stage.setScene(scene); // Attach the scene to the stage
        stage.show(); // Display the stage
    }

    private void updateQuestionDisplay(Question q) {
        questionText.setText(q.getQuestionText()); // Update the displayed question text
        answerBlock.getChildren().clear(); // Clear previous answer options

        if (q instanceof FillInTheBlank) {
            TextField field = new TextField(q.getAnswer()); // Create a text field for the answer
            field.setOnKeyReleased(event -> ((FillInTheBlank) q).setAnswer(field.getText())); // Update the answer on input
            answerBlock.getChildren().add(field); // Add the text field to the answer block
        } else if (q instanceof MultipleChoice) {
            for (int i = 0; i < ((MultipleChoice) q).getPotentialAnswers().size(); i++) {
                String option = ((MultipleChoice) q).getPotentialAnswers().get(i); // Get each potential answer
                Button button = new Button(option); // Create a button for the option
                int index = i; // Store the index of the option
                button.setOnAction(event -> {
                    ((MultipleChoice) q).setSelectedAnswer(index); // Update the selected answer
                    updateQuestionDisplay(q); // Refresh the display
                });
                answerBlock.getChildren().add(button); // Add the button to the answer block
            }
        }
    }

    public static void main(String[] args) {
        launch(); // Launch the application
    }
}
```

---

## **3. Question Data**

### **Test3Questions Class**
- **Purpose**: Initializes the test questions.
- **Key Features**:
  - Holds a static list of `Question` objects.
  - Populates the list with sample questions.

#### **Code Example**:
```java
public class Test3Questions {
    private static final List<Question> test2Questions; // Static list to store questions

    static {
        test2Questions = new ArrayList<>(); // Initialize the list

        MultipleChoice mc = new MultipleChoice(); // Create a multiple-choice question
        mc.setQuestionText("How much wood could a wood chuck chuck if a wood chuck could chuck wood?"); // Set the question text
        mc.setPotentialAnswers(Arrays.asList("Over 9000", "What's a wood chuck?", "Go away", "2", "A lot!")); // Set the options
        test2Questions.add(mc); // Add the question to the list

        FillInTheBlank fb = new FillInTheBlank(); // Create a fill-in-the-blank question
        fb.setQuestionText("Franco is the _________ teacher"); // Set the question text
        test2Questions.add(fb); // Add the question to the list

        for (int i = 0; i < test2Questions.size(); i++) {
            test2Questions.get(i).setQuestionNumber(i + 1); // Assign a number to each question
        }
    }

    public static List<Question> getTest3Questions() {
        return test2Questions; // Return the list of questions
    }
}
```

---

## **4. Key Concepts for Exam**

### **Inheritance and Polymorphism**
- `Question` is the base class; `MultipleChoice` and `FillInTheBlank` extend it.
- Abstract method `getAnswer()` enforces implementation in derived classes.

### **JavaFX for GUI**
- Usage of `VBox`, `TextField`, `Button`, and event listeners.

### **Collections and Encapsulation**
- `List` is used to manage options and questions.
- Private fields with public getters and setters ensure controlled access.
