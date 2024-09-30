public class Tablet extends Device {
    private String deviceName;

    public Tablet(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void powerOn() {
        System.out.println("Tablet "+deviceName+" on");
    }

    @Override
    public void powerOff() {
        System.out.println("Tablet "+deviceName+" off");
    }

}
