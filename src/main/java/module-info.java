module com.example.myfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.myfx to javafx.fxml;
    exports com.example.myfx;
}