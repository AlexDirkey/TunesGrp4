package com.example.tunesgrp4.BE;

public class Song // public, så det kan tale sammen med main-metoden
//Must contain song info. Needs getters and setters.

    //Definer sang-classen
{
    private int id;
    private String title;
    private String genre;
    private String duration;
    private Album album;
    private Artist artist;
    private String fileUrl;

    public Song() {} // Constructer - allows creation of a song.

    public Song(int id, String title, String genre, String duration, Album album, Artist artist, String fileUrl) // com.example.tunesgrp4.BE.Song-parameter
// skal fodres med de rigtige parametre - id
    {
    this.id = id; //Sets a song's id
    this.title = title; //Sets the songs title
    this.genre = genre; //Sets the songs genre
    this.duration = duration; //Sets the duration of the song
    this.fileUrl = fileUrl; //Locates the mp3-file

}

    public Song(int id, String title, String album, int duration) {
    }

    //Getters and setters - Gets info, id, artist, etc, from our database. They are 'public', as to "talk" with our other classes
public int getId()
{return id;}

public void setId(int id)
{this.id = id;}

public String getTitle()
{ return title; }

public void setTitle(String Title)
{ this.title = title; }

public String getGenre(String Genre)
{ return genre; }

public void setGenre(String Genre)
{ this.genre = genre; }

public String getDuration()
{return duration;}

public void setDuration(String duration)
{this.duration = duration;}

public Album getAlbum() {
        return album;
    }

public void setAlbum(Album album)
{ this.album = album; }

public Artist getArtist() {
        return artist;
    }

public void setArtist(Artist artist)
{ this.artist = artist;}

public String getFileUrl() {
        return fileUrl;
}
}

