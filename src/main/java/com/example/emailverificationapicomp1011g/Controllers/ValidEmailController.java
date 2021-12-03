package com.example.emailverificationapicomp1011g.Controllers;

import com.example.emailverificationapicomp1011g.Utility.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ValidEmailController {
    @FXML
    private Label l1;

    @FXML
    private Button validButton;

    @FXML
    void onReturnClick(ActionEvent event) {
        try {
            SceneChanger.changeScenes(event, "Email-Verification-View.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
