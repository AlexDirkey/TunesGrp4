package com.example.tunesgrp4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewEditPlayList {

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