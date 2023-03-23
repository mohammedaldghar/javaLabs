module com.example.notpad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notpad to javafx.fxml;
    exports com.example.notpad;
}