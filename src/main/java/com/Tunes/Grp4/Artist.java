package com.Tunes.Grp4;
public class Artist
//Must contain artist info. Needs getters and setters.
{
private int id; // Unique id for the artist
private String name; // Name of the artist, ex, Bruce Willis
private Album album; //Name of the album - returns null, if the song isnt on any album

    public Artist(int id, String name, Album album) {// Constructor for the artist class
        this.id = id;
        this.name = name;
        this.album = album;
    }

    //Getters and setters - gets info from the database and connects it to the GUI
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
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

}
