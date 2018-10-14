package com.shelydexter;

public class Door {

    private String material;
    private boolean isWindowed;
    private String lock;
    private String color;

    public Door(String material, boolean isWindowed, String lock, String color) {
        this.material = material;
        this.isWindowed = isWindowed;
        this.lock = lock;
        this.color = color;
    }

    public String getDoor() {
        return color + " " + material + (isWindowed ? "windowed " : "") + " door with " + lock + " lock";
    }
}
