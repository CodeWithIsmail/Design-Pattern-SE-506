public class Smartphone extends Device {
    private String deviceName;

    public Smartphone(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void powerOn() {
        System.out.println("Smartphone " + deviceName + " on");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone off");
    }

}
