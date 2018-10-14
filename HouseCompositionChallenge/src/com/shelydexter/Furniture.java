package com.shelydexter;

public class Furniture {

    private String type;
    private String material;
    private String color;
    private Dimensions dimensions;
    private Location location;

    public Furniture(String type, String material, String color, Dimensions dimensions, Location location) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.dimensions = dimensions;
        this.location = location;
    }

    public String getFurniture() {
        return color + " " + material + " " + type + " with dimensions " + dimensions.getDimensions() + " located " + location.getLocation();
    }
}
