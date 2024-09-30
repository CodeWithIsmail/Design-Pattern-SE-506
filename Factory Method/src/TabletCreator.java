public class TabletCreator extends Creator{
    @Override
    public Device factoryMethod(String deviceName) {
        return new Tablet(deviceName);
    }
}
