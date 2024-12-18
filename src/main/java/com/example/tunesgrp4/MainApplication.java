package com.example.tunesgrp4;

import com.example.tunesgrp4.bll.Playlist;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.tunesgrp4.dal.MyDatabaseConnector;
import com.example.tunesgrp4.BE.Song;
import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 825, 625);
        stage.setTitle("Tunes Grp4");
        stage.setScene(scene);
        stage.show();

        //MainApplication application = (MainApplication) fxmlLoader.getController();
       // application.loadSongsFromDatabase;
    }

    public static void main(String[] args) {
        launch();
    }

    public void refreshPlaylistTable() {
    }

    public void addPlaylistToTable(Playlist newPlaylist) {
    }
}