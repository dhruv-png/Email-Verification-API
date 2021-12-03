package com.example.emailverificationapicomp1011g.Controllers;

import com.example.emailverificationapicomp1011g.Utility.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class InvalidEmailController {

    @FXML
    private Button invalidButton;

    @FXML
    private Label errorLabel;


    @FXML
    void onReturnClick2(ActionEvent event) {
        try {
            SceneChanger.changeScenes(event, "Email-Verification-View.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
