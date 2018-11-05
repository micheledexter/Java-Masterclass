package com.shelydexter;

public class Song {
    private String songTitle;
    private String albumTitle;

    public Song(String songTitle, String albumTitle) {
        this.songTitle = songTitle;
        this.albumTitle = albumTitle;
    }

    public static Song createNewSong(String songTitle, String albumTitle) {
        return new Song(songTitle, albumTitle);
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }
}
