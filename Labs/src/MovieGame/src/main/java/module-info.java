module com.moviegame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.moviegame to javafx.fxml;
    exports com.moviegame;
}