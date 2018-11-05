package com.shelydexter;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songList;

    public Playlist() {
        this(new ArrayList<Song>());
    }

    public Playlist(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }
}
