public class AmericanFactory extends Factory{
    @Override
    public Car createCar() {
        return new AmericanCar();
    }
}
