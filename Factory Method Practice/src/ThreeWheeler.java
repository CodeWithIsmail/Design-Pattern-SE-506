public class ThreeWheeler extends Vehicle {
    public String name;

    public ThreeWheeler(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("Three wheeler " + name);
    }
}
