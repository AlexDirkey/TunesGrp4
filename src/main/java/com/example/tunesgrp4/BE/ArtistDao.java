package com.example.tunesgrp4.BE;

import com.example.tunesgrp4.MyDatabaseConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistDao {

    // Henter alle kunstnere fra databasen
    public List<Artist> getAllArtists() {
        List<Artist> artists = new ArrayList<>();
        String sql = "SELECT * FROM artists";  // SQL-forespørgsel for at hente alle kunstnere

        try (Connection connection = MyDatabaseConnector.getConnection();  // Brug DatabaseConnection
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                // Opret et Artist-objekt for hver række i resultatsættet
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Album album = null; // For nu, vi har ikke albumdata, men vi kan hente det senere
                artists.add(new Artist(id, name, album)); // Tilføj artist til listen
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return artists;
    }

    // Henter en specifik kunstner baseret på ID
    public Artist getArtistById(int id) {
        Artist artist = null;
        String sql = "SELECT * FROM artists WHERE id = ?";

        try (Connection connection = MyDatabaseConnector.getConnection();  // Brug DatabaseConnection
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);  // Sætter artistens ID i forespørgslen
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                Album album = null; // Vi kan udvide det her senere for at hente albumdata
                artist = new Artist(id, name, album);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return artist;
    }
}
