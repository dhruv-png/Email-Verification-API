package com.example.emailverificationapicomp1011g.Utility;

import com.example.emailverificationapicomp1011g.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    public static void changeScenes(ActionEvent event, String fxmlFileLocation) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileLocation));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("");
        Image icon = new Image(SceneChanger.class.getResourceAsStream("Images/logo.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
}