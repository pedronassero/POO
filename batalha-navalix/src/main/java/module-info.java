module com.example.batalhanavalix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.batalhanavalix to javafx.fxml;
    exports com.example.batalhanavalix;
}