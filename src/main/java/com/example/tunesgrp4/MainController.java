package com.example.tunesgrp4;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

//package dal.db; Tilføjet i videoen, men fungerer ikke? hmmmmm
//Must handle what happens in the GUI when a button is clicked. Must also be able to recive data and modify them.

public class MainController {

    @FXML
    private Button pListNewBtn;

    @FXML
    private Button pListEditBtn;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Grp4's Itunes Project");
    }

    @FXML
    public void openNEpList(ActionEvent event) {
        try
        {   //Loads EditPlayList.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditPlayList.fxml"));
            Parent root = fxmlLoader.load();

            NewEditPlayList controller = fxmlLoader.getController();

            //Creates a new Window for the GUI
            Stage stage = new Stage();

            //Determines which action should be initialized.
            if (event.getSource() == pListNewBtn) {
                stage.setTitle("New Playlist");
                controller.initializeForNewPlaylist();
            }
            else if (event.getSource() == pListEditBtn) {
                stage.setTitle("Edit Playlist");
                controller.initializeForEditPlaylist();
            }

            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace(); //Writes Error to console incase anything is wrong

        }
    }
}