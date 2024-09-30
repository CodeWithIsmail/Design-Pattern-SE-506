public class SmartphoneCreator extends Creator{

    @Override
    public Device factoryMethod(String deviceName) {
        return new Smartphone(deviceName);
    }
}
