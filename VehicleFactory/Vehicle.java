package VehicleFactory;

public class Vehicle {
    //this refers to Me (the Child).
//
//super refers to My Parent.
//
//We use it for two main things:
//
//Calling the Parent's Constructor (Most common).
//
//Calling a Parent's Method (Even if the Child overrode it).
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;

    }

    void honk() {
        System.out.println("Honk Honk!");
    }
}
