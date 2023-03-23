module com.example.bdconnect {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;
    requires mysql.connector.j;

    opens com.example.bdconnect to javafx.fxml;
    exports com.example.bdconnect;
}