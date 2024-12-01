module com.example.data {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.data to javafx.fxml;
    exports com.example.data;
}