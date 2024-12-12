package com.example.tunesgrp4.BE;

public class Album
//must contain com.example.tunesgrp4.BE.Album info. Needs getters and setters.
{
private int id; // id fof the album
private String name; //Title of the album
private String Artist; //Name of the artist/artists
private int year; // album release year
private String genre; // album genre
private String playlist; // Sets the playlist

    //Getters and setters - gets album-info from our Database
    public Album(int id, String name, String Artist, int year, String genre, String playlist) {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return Artist;
    }
    public void setArtist(String artist) {
        this.Artist = artist;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPlaylist() {
        return playlist;
    }
    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

}
