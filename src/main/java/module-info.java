module com.example.pbofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pbofinal to javafx.fxml;
    exports com.example.pbofinal;
}