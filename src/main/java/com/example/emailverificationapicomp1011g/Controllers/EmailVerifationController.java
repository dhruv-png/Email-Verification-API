package com.example.emailverificationapicomp1011g.Controllers;

import com.example.emailverificationapicomp1011g.EmailResponse;
import com.example.emailverificationapicomp1011g.Utility.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EmailVerifationController {
    @FXML
    private Button b1;

    @FXML
    private TextField t1;

    @FXML
    void onCheckClick(ActionEvent event) {
        EmailResponse e = new EmailResponse();
        if(e.getStatus() == "true") {
            try{
            SceneChanger.changeScenes(event, "valid-email-view.fxml");
          } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getStatus() == "false") {
            try {
                SceneChanger.changeScenes(event, "invalid-email-view.fxml");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}