package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

import java.net.URL;

public class MenuController {
    @FXML
    public void handlePlayButton(ActionEvent event){
        try{
            URL url = MenuController.class.getResource("../view/Game.fxml");

            FXMLLoader loader = new FXMLLoader(url);
            Parent gameRoot = loader.load();

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            Scene gameScene = new Scene(gameRoot);

            currentStage.setTitle("Cincuentazo - Partida");
            currentStage.setScene(gameScene);
            currentStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void handleExitButton(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
