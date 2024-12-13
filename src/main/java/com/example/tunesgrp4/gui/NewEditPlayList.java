package com.example.tunesgrp4.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewEditPlayList {

    @FXML
    public void handleSave(ActionEvent event) {
        System.out.println("Save button clicked!");
    }

    @FXML
    private TextField playlistNameField; //Playlist name field

    public void initializeForNewPlaylist() {
        System.out.println("Preparing for a new playlist...");
        playlistNameField.clear(); //Cleans text field to prepare user for new playlist
    }

    public void initializeForEditPlaylist() {
        System.out.println("Preparing to edit an existing playlist...");
        //Loads existing data from the playlist (Sketched for visual purpose)
        playlistNameField.setText("Straight Bangers");
    }

}