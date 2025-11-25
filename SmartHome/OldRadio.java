package SmartHome;


public class OldRadio implements BluetoothEnabled {
    @Override
    public void pairDevice(String deviceName) {
        System.out.println("Radio paired with " + deviceName);
    }

    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        OldRadio radio = new OldRadio();

        tv.connectToNetwork("Home-WiFi");
        radio.pairDevice("AirPods");
//        radio.connectToNetwork("Home-WIFI"); checking what error might pop


    }
}
