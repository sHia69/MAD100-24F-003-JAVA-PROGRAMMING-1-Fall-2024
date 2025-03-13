module com.fxexample.firstfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxexample.firstfx to javafx.fxml;
    exports com.fxexample.firstfx;
}