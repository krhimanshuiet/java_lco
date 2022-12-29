module com.example.fxmlfile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmlfile to javafx.fxml;
    exports com.example.fxmlfile;
}