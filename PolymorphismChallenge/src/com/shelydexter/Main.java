package com.shelydexter;

class Car {

    private boolean engine;
    private int cylinders = 0;
    private int wheels;
    private int speed = 0;
    private String name = "Unknown";

    public Car(int cylinders, String name) {
        this(true, cylinders, 4, name, 0);
    }

    public Car(boolean engine, int cylinders, int wheels, String name, int speed) {
        this.engine = engine;
        if (cylinders < 0 || cylinders > 10) {
            System.out.println("Invalid number of cylinders. Using default.");
        } else {
            this.cylinders = cylinders;
        }
        this.wheels = wheels;
        this.name = name;
        if (speed < 0) {
            System.out.println("Invalid speed. Using default.");
        } else {
            this.speed = speed;
        }

    }

    public boolean startEngine() {
        if (isRunning()) {
            System.out.println("Engine is already running.");
            return false;
        }
        System.out.println("Starting engine.");
        return true;
    }

    public boolean stopEngine() {
        if (!isRunning()) {
            System.out.println("Engine is already stopped.");
            return false;
        }
        System.out.println("Stopping engine.");
        return true;
    }

    public int accelerate(int speed) {
        this.speed += speed;
        return this.speed;
    }

    public int brake(int speed) {
        if (this.speed - speed < 0) {
            this.speed = 0;
        } else {
            this.speed -= speed;
        }
        return this.speed;
    }

    public String reportSpeed() {
        return getName() + "is traveling at " + this.speed + "mph";
    }

    private boolean isRunning() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}

class Generic extends Car {
    public Generic() {
        super(4, "Generic");
    }
}

class Honda extends Car {
    public Honda() {
        super(4, "Honda");
    }

    public Honda(boolean engine, int cylinders, int wheels, int speed) {
        super(engine, cylinders, wheels, "Honda", speed);
    }

    public String reportSpeed() {
        return getName() + "is sputtering at " + getSpeed() + "mph";
    }
}

class Farrari extends Car {
    public Farrari() {
        super(6, "Farrari");
    }

    public Farrari(boolean engine, int cylinders, int wheels, int speed) {
        super(engine, cylinders, wheels, "Farrari", speed);
    }

    @Override
    public String reportSpeed() {
        return getName() + " is speeding at " + getSpeed() + "mph";
    }
}

class Firebird extends Car {
    public Firebird() {
        super(8, "Firebird");
    }

    public Firebird(boolean engine, int cylinders, int wheels, int speed) {
        super(engine, cylinders, wheels, "Firebird", speed);
    }

    @Override
    public String reportSpeed() {
        return getName() + " is speeding at " + getSpeed() + "mph";
    }
}

public class Main {

    public static void main(String[] args) {

        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        for (int i = 0; i < 10; i++) {
            Car car = randomCar();
            int accelerate = randomSpeed();
            int brake = randomSpeed();
            System.out.println("Car #" + i + ": " + car.getName());
            System.out.println("Accelerating to " + car.accelerate(accelerate) + "mph");
            System.out.println("Braking to " + car.brake(brake) + "mph\n");
        }
    }

    public static int randomSpeed() {
        int randomNumber = (int) (Math.random() * 60) + 1;
        return randomNumber;
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Generic();
            case 2:
                return new Honda();
            case 3:
                return new Farrari();
            case 4:
                return new Firebird();
        }
        return null;
    }
}
