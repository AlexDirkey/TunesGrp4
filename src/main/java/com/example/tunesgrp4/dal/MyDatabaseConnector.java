package com.example.tunesgrp4.dal;

import com.example.tunesgrp4.BE.Song;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyDatabaseConnector {

    public static SQLServerDataSource dataSource;

    public MyDatabaseConnector() {
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("10.176.111.34");
        dataSource.setDatabaseName("Grp4Tunes");
        //dataSource.setUser(System.getenv("CSe2024a_e_0")); // Brug miljøvariabler
        dataSource.setUser("CSe2024a_e_0");
        dataSource.setPassword("CSe2024aE0!24");
       // dataSource.setPassword(System.getenv("CSe2024aE0!24")); // Brug miljøvariabler
        dataSource.setPortNumber(1433);
        dataSource.setEncrypt(true);
        dataSource.setTrustServerCertificate(true);
    }

    public static Connection getConnection() throws SQLServerException {
        return dataSource.getConnection();
    }

    public static void main(String[] args) {
        MyDatabaseConnector databaseConnector = new MyDatabaseConnector();

        try (Connection connection = getConnection()) {
            System.out.println("Connection successful! Is it closed? " + connection.isClosed());
        } catch (SQLServerException e) {
            System.err.println("Database connection error: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    //Henter sange fra databasen
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();
        String query = "SELECT id, title, artist, album, duration, file_url FROM song"; // tilpas???

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String artist = resultSet.getString("artist");
                String album = resultSet.getString("album");
                int duration = resultSet.getInt("duration");
                String fileUrl = resultSet.getString("fileUrl");

              //  songs.add(new Song(songTitle, songArtist, songGenre, songDuration, filePath));//

            }


            } catch (SQLException e) {
            e.printStackTrace();
        }
        return songs;
        }
}

