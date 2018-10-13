package com.shelydexter;

public class Car extends Vehicle {

    private String steering;

    public Car() {
        this("Unknown");
    }

    public Car(String steering) {
        this(0, steering);
    }

    public Car(int speed, String steering) {
        super(speed);
        this.steering = steering;
        System.out.println("Car created with speed " + speed + " and " + steering + " steering");
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
        System.out.println("Steering set to " + steering);
    }

    public void changeToAutomatic() {
        if (!this.steering.equals("Automatic")) {
            this.steering = "Automatic";
            System.out.println("Changed car to Automatic steering");
        } else {
            System.out.println("Car already had Automatic steering");
        }
    }

    public void changeToManual() {
        if (!this.steering.equals("Manual")) {
            this.steering = "Manual";
            System.out.println("Changed car to Manual steering");
        } else {
            System.out.println("Car already had Manual steering");
        }
    }

    @Override
    public String getStatus() {
        return "Car is going " + getSpeed() + " distance per time and has " + getSteering() + " steering";
    }
}
