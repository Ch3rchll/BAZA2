package com.example.bazakormit;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Authorization {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}