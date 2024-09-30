public class Laptop extends Device {
    private String deviceName;

    public Laptop(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop "+deviceName+" on");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop "+deviceName+" off");
    }

}
