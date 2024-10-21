public class ThreeWheelerCreator extends Creator {
    @Override
    public Vehicle factoryMethod(String name) {
        return new ThreeWheeler(name);
    }
}
