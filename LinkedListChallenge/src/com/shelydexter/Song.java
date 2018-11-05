package com.shelydexter;

public class Song {
    private String songTitle;

    public Song(String songTitle) {
        this.songTitle = songTitle;
    }

    public static Song createNewSong(String songTitle) {
        return new Song(songTitle);
    }

    public String getSongTitle() {
        return songTitle;
    }
}
