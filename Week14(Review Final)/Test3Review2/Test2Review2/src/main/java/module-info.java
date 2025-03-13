module com.iacobacci.test2review2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iacobacci.test2review2 to javafx.fxml;
    exports com.iacobacci.test2review2;
}