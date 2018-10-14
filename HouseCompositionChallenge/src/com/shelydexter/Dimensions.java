package com.shelydexter;

public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getDimensions() {
        return width + " units wide x " + height + " units high x " + depth + " deep";
    }
}
