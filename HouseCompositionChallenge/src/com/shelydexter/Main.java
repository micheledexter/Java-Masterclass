package com.shelydexter;

public class Main {

    public static void main(String[] args) {
        Dimensions houseDimensions = new Dimensions(41, 11, 31);
        Door roomDoor = new Door("wood", true, "tumbler", "stained");
        Floor roomFloor = new Floor("carpet", "green");
        Wall roomWalls = new Wall("eggshell paint", "teal");
        Ceiling roomCeiling = new Ceiling("sprayed", "white");
        Dimensions roomDimensions = new Dimensions(40, 10, 30);
        Furniture roomFurniture = new Furniture("couch", "leather", "black", new Dimensions(8, 4, 4), new Location(10, 30, 0));
        Room houseRoom = new Room(5, roomDoor,roomFloor, roomWalls, roomCeiling, roomDimensions, true, roomFurniture);
        House theHouse = new House(houseDimensions, houseRoom, "yellow", "shingle");
        
        theHouse.buildHouse();
    }
}
