package com.shelydexter;

public class Wall {

    private String material;
    private String color;

    public Wall(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getWall() {
        return color + " " + material + " wall";
    }
}
