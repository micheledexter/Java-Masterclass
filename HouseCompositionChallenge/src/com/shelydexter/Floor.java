package com.shelydexter;

public class Floor {

    private String style;
    private String color;

    public Floor(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public String getFloor() {
        return color + " " + style + " flooring";
    }
}
