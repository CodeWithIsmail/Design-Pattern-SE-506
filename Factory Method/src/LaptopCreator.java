public class LaptopCreator extends Creator{
    @Override
    public Device factoryMethod(String deviceName) {
        return new Laptop(deviceName);
    }
}
