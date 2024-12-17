package com.example.tunesgrp4.gui;

import com.example.tunesgrp4.BE.Song;
import com.example.tunesgrp4.bll.Playlist;
import com.example.tunesgrp4.dal.MyDatabaseConnector;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.io.IOException;
import java.util.List;

//package dal.db; Tilføjet i videoen, men fungerer ikke? hmmmmm
//Must handle what happens in the GUI when a button is clicked. Must also be able to recive data and modify them.


public class SongController {

    @FXML
    private TableView<Playlist> pListTable;

    @FXML
    private TableColumn<Playlist, Integer> pListSongCol;

    @FXML
    private TableColumn<Playlist, String> pListNameCol;

    @FXML
    private TableColumn<Playlist, String> pListTimeCol;

    @FXML
    private Button pListNewBtn;

    @FXML
    private Button pListEditBtn;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Grp4's Itunes Project");
        private ObservableList<Song> songList;

    }

    public void addPlaylistToTable(Playlist playlist) {
        pListTable.getItems().add(playlist);
    }

    @FXML
    public void initialize() {
        //Links coulumns to Playlist attributes
        pListNameCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        pListSongCol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getSongCount()).asObject());
        pListTimeCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTotalTime()));

        //Placeholder data for testing and understanding
        ObservableList<Playlist> playlists = FXCollections.observableArrayList
                (
                new Playlist("Rock Classics", 10, "45:30"),
                new Playlist("Pop Hits", 8, "30:00"),
                new Playlist("Jazz Essentials", 12, "50:45")
                );
        pListTable.setItems(playlists);

    }
    @FXML
    public void DeletepList(ActionEvent Event) {
        //Checks if a playlist is selected in the table
        Playlist selectedPlaylist = pListTable.getSelectionModel().getSelectedItem();
        if (selectedPlaylist == null) {
            System.out.println("No playlist selected!");
            return;
        }

        System.out.println("Deleting playlist " + selectedPlaylist.getName());

        pListTable.getItems().remove(selectedPlaylist);
    }

    @FXML
    public void openNEpList(ActionEvent event) {
        try
        {   //Loads EditPlayList.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/tunesgrp4/EditPlayList.fxml"));
            Parent root = fxmlLoader.load();

            NewEditPlayList controller = fxmlLoader.getController();
            controller.setMainController(this);
            //Creates a new Window for the GUI
            Stage stage = new Stage();

            //Determines which action should be initialized.
            if (event.getSource() == pListNewBtn) {
                stage.setTitle("New Playlist");
                controller.initializeForNewPlaylist();
            }
            else if (event.getSource() == pListEditBtn) {
                stage.setTitle("Edit Playlist");
                Playlist selectedPlaylist = pListTable.getSelectionModel().getSelectedItem();
                if (selectedPlaylist != null) {
                controller.initializeForEditPlaylist(selectedPlaylist); //Pass the playlist to edit
            } else {
                    System.out.println("No playlist selected to edit!");
                    return;
            }
            }
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace(); //Writes Error to console incase anything is wrong


            MyDatabaseConnector databaseConnector = new MyDatabaseConnector();
            List<Song> songs = databaseConnector.getAllSongs();

            songList = FXCollections.observableArrayList(songs);

            songTable.setItems(songList);
        }

        }
        // Updates table
        public void refreshPlaylistTable() {
            pListTable.refresh();
        }
}