package com.shelydexter;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    private String albumArtist;
    private ArrayList<Song> albumSongs;

    public Album(String albumTitle, String albumArtist) {
        this(albumTitle, albumArtist, new ArrayList<Song>());
    }

    public Album(String albumTitle, String albumArtist, ArrayList<Song> albumSongs) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumSongs = albumSongs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }
}
