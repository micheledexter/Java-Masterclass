package com.shelydexter;

public class Room {

    private int windows;
    private Door door;
    private Floor floor;
    private Wall walls;
    private Ceiling ceiling;
    private Dimensions dimensions;
    private boolean hasFurniture;
    private Furniture furniture;

    public Room(int windows, Door door, Floor floor, Wall walls, Ceiling ceiling, Dimensions dimensions, boolean hasFurniture, Furniture furniture) {
        this.windows = windows;
        this.door = door;
        this.floor = floor;
        this.walls = walls;
        this.ceiling = ceiling;
        this.dimensions = dimensions;
        this.hasFurniture = hasFurniture;
        this.furniture = furniture;
    }

    public void buildRoom() {
        System.out.println("Building room...");
        System.out.println("Room is " + dimensions.getDimensions() + "with");
        System.out.println(floor.getFloor()+ ", " + walls.getWall() + "s and a " + ceiling.getCeiling() + ".");
        if (hasFurniture) System.out.println("It has a " + furniture.getFurniture());
        System.out.println("It has " + windows + " windows and a " + door.getDoor());
    }
}
