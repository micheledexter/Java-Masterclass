package com.shelydexter;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

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

    public boolean addAlbumToAvailableAlbums(Album album) {
        if (findAlbumByTitle(album.getAlbumTitle()) != null) {
            System.out.println("Album is already available");
            return false;
        }
        System.out.println("Album " + album.getAlbumTitle() + " added to available albums");
        this.availableAlbums.add(album);
        return true;
    }

    public boolean addSongToPlaylist(Song song) {
        if (findSongByTitle(song.getSongTitle()) != null) {
            System.out.print("Song is already in the playlist, are you sure you want to add it again? (Y/n): ");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            action = action.toLowerCase();
            switch (action) {
                case "y": case "yes":
                    break;
                default:
                    System.out.println("Song not added to playlist.");
                    return false;
            }
        }
        this.playlist.add(song);
        System.out.println("Song added to playlist.");
        return true;
    }

    public Song findSongByTitle(String songTitle) {
        ListIterator<Album> albumListIterator = this.availableAlbums.listIterator();

        while (albumListIterator.hasNext()) {
            Album currentAlbum = albumListIterator.next();
            Song locatedSong = currentAlbum.findSongByTitle(songTitle);
            if (locatedSong != null) {
                return locatedSong;
            }
        }
        return null;
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
