public class Main {
    public static void main(String[] args) {
        Creator threeWheelerCreator = new ThreeWheelerCreator();
        Creator twoWheelerCreator = new TwoWheelerCreator();
        Vehicle threeWheeler = threeWheelerCreator.factoryMethod("hello");
        Vehicle twoWheeler = twoWheelerCreator.factoryMethod("world");
        threeWheeler.showName();
        twoWheeler.showName();
    }
}