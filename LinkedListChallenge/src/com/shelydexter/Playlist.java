package com.shelydexter;

import java.util.ArrayList;
import java.util.ListIterator;

public class Playlist {
    private ArrayList<Song> playlist;
    private ArrayList<Album> availableAlbums;

    public Playlist() {
        this(new ArrayList<Song>(), new ArrayList<Album>());
    }

    public Playlist(ArrayList<Song> playlist, ArrayList<Album> availableAlbums) {
        this.playlist = playlist;
        this.availableAlbums = availableAlbums;
    }

    public Song findSongByTitle(String songTitle) {
        ListIterator<Album> listIterator = this.availableAlbums.listIterator();

    }

    public Album findAlbumByTitle(String albumTitle) {
        ListIterator<Album> listIterator = this.availableAlbums.listIterator();

        while (listIterator.hasNext()) {
            Album current = listIterator.next();
            if (current.getAlbumTitle() == albumTitle) {
                return current;
            }
        }
        return null;
    }

    public ArrayList<Song> getPlaylist() {
        return this.playlist;
    }

    public ArrayList<Album> getAvailableAlbums() {
        return this.availableAlbums;
    }
}
