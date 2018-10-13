package com.shelydexter;

public class Main {

    public static void main(String[] args) {

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to handle steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviors (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.

        Vehicle groundedPlane = new Vehicle();
        System.out.println("groundedPlane " + groundedPlane.getStatus());

        Vehicle plane = new  Vehicle(1230);
        System.out.println("plane " + plane.getStatus());

        plane.decreaseSpeed(1234);
        plane.decreaseSpeed(230);
        plane.increaseSpeed(500);

        System.out.println("\n");

        Car unknownCar = new Car();
        System.out.println("unknownCar " + unknownCar.getStatus());

        Car parkedAutomatic = new Car("Automatic");
        System.out.println("parkedAutomatic " + parkedAutomatic.getStatus());

        Car drivingAutomatic = new Car(60, "Automatic");
        System.out.println("drivingAutomatic " + drivingAutomatic.getStatus());

        unknownCar.setSteering("Manual");
        unknownCar.changeToAutomatic();
        unknownCar.changeToManual();
        unknownCar.changeToManual();
        unknownCar.increaseSpeed(50);
        unknownCar.decreaseSpeed(60);
        unknownCar.decreaseSpeed(40);

        System.out.println("\n");

        Manual lazyManual = new Manual();
        System.out.println("lazyManual " + lazyManual.getStatus());

        Manual shiftedManual = new Manual(3);
        System.out.println("shiftedManual " + shiftedManual.getStatus());

        Manual drivingManual = new Manual(45, "Manual", 4);
        System.out.println("drivingManual " + drivingManual.getStatus());

        drivingManual.shiftDown(3);
        drivingManual.decreaseSpeed(40);
        drivingManual.shiftDown(2);
        drivingManual.decreaseSpeed(10);
        drivingManual.shiftUp(1);
        drivingManual.increaseSpeed(10);
        drivingManual.changeToManual();
        drivingManual.changeToAutomatic();
    }
}
