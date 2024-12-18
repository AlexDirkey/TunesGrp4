package com.example.tunesgrp4.gui;

import com.example.tunesgrp4.MainApplication;
import com.example.tunesgrp4.bll.Playlist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLOutput;


public class NewEditPlayList {

    private MainApplication mainController;
    private Playlist playlistToEdit; // Holds the playlist being edited.

    public void setMainController(MainApplication mainController) {
        this.mainController = mainController;
}

    @FXML
    public void handleCancel(ActionEvent event) {
        //Get the current window and close it
        Stage stage = (Stage) playlistNameField.getScene().getWindow();
        stage.close();
        System.out.println("Cancel button clicked! Window closed.");
    }
    @FXML
    private TextField playlistNameField; //Playlist name field

    @FXML
    public void handleSave(ActionEvent event) {
        String playlistName = playlistNameField.getText();

        if (playlistName == null || playlistName.trim().isEmpty()) {
            System.out.println("Playlist name cannot be empty");
            return;
        }

        if (playlistToEdit != null) {
            // if editing, update the existing playlist(Instead of creating a new one)
            playlistToEdit.setName(playlistName);
            System.out.println("Updated playlist: " + playlistName);
            mainController.refreshPlaylistTable(); // updates table to show the changes
        } else {
            // if creating new playlist, adds a new one rather than replacing
            Playlist newPlaylist = new Playlist(playlistName, 0, "0:00");
            mainController.addPlaylistToTable(newPlaylist);
            System.out.println("Crated new playlist: " + playlistName);
        }

        //Closes current window
        Stage stage = (Stage) playlistNameField.getScene().getWindow();
        stage.close();
    }


    public void initializeForNewPlaylist() {
        System.out.println("Preparing for a new playlist...");
        playlistToEdit = null; //If there's no playlist to edit
        playlistNameField.clear(); //Cleans text field to prepare user for new playlist
    }

    public void initializeForEditPlaylist(Playlist playlist) {
        System.out.println("Preparing to edit an existing playlist...");
        this.playlistToEdit = playlist; // Store playlist to edit
        playlistNameField.setText(playlist.getName()); //Print current playlist  name to data field
    }

    public void MainApplication(SongController songController) {
    }
}