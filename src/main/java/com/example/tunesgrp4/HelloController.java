package com.example.tunesgrp4;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
//package dal.db; Tilføjet i videoen, men fungerer ikke? hmmmmm
import com.microsoft.sqlserver.jdbc.SQLServerDriver; //Driver, der gør, vi kan tilgå databasen


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Grp4's Itunes Project");
    }
}