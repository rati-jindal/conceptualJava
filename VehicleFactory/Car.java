package VehicleFactory;


public class Car extends Vehicle {

    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
//        Note: Super should always be the first statement!
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void drift() {
        System.out.println("The " + brand + " is drifting");
    }

    public static void main(String[] args) {
        Car model1 = new Car("Tesla", 200, 2);

//        model1.brand = "Toyota";
//        model1.speed = 100;
//        model1.numberOfDoors = 4;
        System.out.println(model1.brand + " " + model1.numberOfDoors);

        model1.honk();
        model1.drift();
    }
}
