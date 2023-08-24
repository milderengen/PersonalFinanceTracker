module com.example.personalfinancetracker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.personalfinancetracker to javafx.fxml;
    exports com.example.personalfinancetracker;
}