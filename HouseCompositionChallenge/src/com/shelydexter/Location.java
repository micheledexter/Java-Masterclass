package com.shelydexter;

public class Location {

    private int x;
    private int y;
    private int z;

    public Location(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getLocation() {
        return x + " over " + y + " back " + z + " up";
    }
}
