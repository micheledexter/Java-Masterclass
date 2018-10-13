package com.shelydexter;

public class Vehicle {

    private int speed;

    public Vehicle() {
        this(0);
    }

    public Vehicle(int speed) {
        this.speed = speed;
        System.out.println("Vehicle created with speed " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed(int speed) {
        this.speed += speed;
        System.out.println("Increased speed by " + speed + " to " + this.speed);
    }

    public void decreaseSpeed(int speed) {
        if (this.speed - speed < 0) {
            System.out.println("Cannot decrease speed below 0");
        } else {
            this.speed -= speed;
            System.out.println("Decreased speed by " + speed + " to " + this.speed);
        }
    }

    public String getStatus() {
        return "Vehicle is going " + getSpeed() + " distance per time";
    }
}
