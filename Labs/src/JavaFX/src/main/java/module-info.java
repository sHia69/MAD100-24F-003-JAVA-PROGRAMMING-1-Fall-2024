module com.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.javafx to javafx.fxml;
    exports com.javafx;
}