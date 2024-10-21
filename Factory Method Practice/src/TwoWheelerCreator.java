public class TwoWheelerCreator extends Creator {
    @Override
    public Vehicle factoryMethod(String name) {
        return new TwoWheeler(name);
    }
}
