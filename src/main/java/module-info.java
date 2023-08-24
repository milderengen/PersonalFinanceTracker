module com.example.personalfinancetracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.personalfinancetracker to javafx.fxml;
    exports com.example.personalfinancetracker.models;
    exports com.example.personalfinancetracker;
    exports com.example.personalfinancetracker.DAO;
    opens com.example.personalfinancetracker.DAO to javafx.fxml;
}