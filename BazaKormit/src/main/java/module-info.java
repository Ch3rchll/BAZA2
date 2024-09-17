module com.example.bazakormit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bazakormit to javafx.fxml;
    exports com.example.bazakormit;
}