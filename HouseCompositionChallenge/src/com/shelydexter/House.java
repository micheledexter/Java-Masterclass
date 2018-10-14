package com.shelydexter;

public class House {

    private Dimensions dimensions;
    private Room room;
    private String color;
    private String roof;

    public House(Dimensions dimensions, Room room, String color, String roof) {
        this.dimensions = dimensions;
        this.room = room;
        this.color = color;
        this.roof = roof;
    }

    public void buildHouse() {
        System.out.println("Building house...");
        System.out.println("House is " + dimensions.getDimensions() + " with a " + color + "exterior and " + roof + " roof");
        room.buildRoom();
    }
}
