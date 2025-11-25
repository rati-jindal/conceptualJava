package VehicleFactory;

public class Bicycle extends Vehicle {

    int gearCount;

    Bicycle(String brand, int speed, int gearCount) {
        super(brand, speed);
        this.gearCount = gearCount;
    }

    @Override
    void honk(){
        System.out.println("Rings !!!");
    }

    void ringBell() {
        System.out.println("Ring Ring!!");
    }

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle("Gaint", 20, 18);

//        b1.brand = "Gaint";
//        b1.speed = 20;
//        b1.gearCount = 18;

        b1.honk();
        b1.ringBell();
    }
}
