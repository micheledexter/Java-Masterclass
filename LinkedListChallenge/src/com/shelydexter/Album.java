package com.shelydexter;

import java.util.ArrayList;
import java.util.ListIterator;

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

    public boolean addSongToAlbum(String songTitle) {
        if (findSongByTitle(songTitle) != null) {
            System.out.println("Song already exists in album");
            return false;
        }
        albumSongs.add(Song.createNewSong(songTitle));
        return true;
    }

    public Song findSongByTitle(String songTitle) {
        ListIterator<Song> listIterator = this.albumSongs.listIterator();

        while (listIterator.hasNext()) {
            Song current = listIterator.next();
            if (current.getSongTitle() == songTitle) {
                return current;
            }
        }
        return null;
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
