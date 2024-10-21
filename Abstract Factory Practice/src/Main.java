public class Main {
    public static void main(String[] args) {
        Factory americanFactory = new AmericanFactory();
        Factory europeFactory = new EuropeFactory();

        Car americanCar = americanFactory.createCar();
        Car europeCar = europeFactory.createCar();

        americanCar.createCar();
        europeCar.createCar();

    }
}  