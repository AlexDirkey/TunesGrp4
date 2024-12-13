package com.example.tunesgrp4.bll;


public class Playlist {
    private String name;
    private int songCount;
    private String totalTime;

    public Playlist(String name, int songCount, String totalTime) {
        this.name = name;
        this.songCount = songCount;
        this.totalTime = totalTime;
    }

    public String getName() {
        return name;
    }

    public int getSongCount() {
        return songCount;
    }

    public String getTotalTime() {
        return totalTime;
    }
}