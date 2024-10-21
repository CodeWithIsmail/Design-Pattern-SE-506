public class TwoWheeler extends Vehicle {
    public String name;

    public TwoWheeler(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("Two wheleer " + name);
    }
}
