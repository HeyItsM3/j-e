module com.example.ejerc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerc to javafx.fxml;
    exports com.example.ejerc;
}