public class EuropeFactory extends Factory{
    @Override
    public Car createCar() {
        return new EuropeCar();
    }
}
