package com.shelydexter;

public class Ceiling {

    private String style;
    private String color;

    public Ceiling(String style, String color) {
        this.style = style;
        this.color = color;
    }

    public String getCeiling() {
        return color + " " + style + " ceiling";
    }
}
