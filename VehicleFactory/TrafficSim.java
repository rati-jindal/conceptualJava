package VehicleFactory;

public class TrafficSim {
    public static void main(String[] args) {
        Vehicle[] traffic = new Vehicle[2];

        traffic[0] = new Car("Ford", 120, 4);
        traffic[1] = new Bicycle("Trek", 15, 10);

        for (Vehicle v : traffic) {
            v.honk();
        }
    }


}
