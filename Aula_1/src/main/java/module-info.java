module com.example.aula_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aula_1 to javafx.fxml;
    exports com.example.aula_1;
}