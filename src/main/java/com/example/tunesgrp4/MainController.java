package com.example.tunesgrp4;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
//package dal.db; Tilføjet i videoen, men fungerer ikke? hmmmmm
//Must handle what happens in the GUI when a button is clicked. Must also be able to recive data and modify them.

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Grp4's Itunes Project");
    }
}