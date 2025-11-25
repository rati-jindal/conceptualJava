package SmartHome;

interface WiFiEnabled {
    void connectToNetwork(String networkName);
}

interface BluetoothEnabled {
    void pairDevice(String deviceName);
}

public class SmartTV implements WiFiEnabled, BluetoothEnabled {


    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("TV connected to " + networkName);
    }

    @Override
    public void pairDevice(String deviceName) {
        System.out.println("TV paired with " + deviceName);

    }
}
