//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Creator smartphoneCreator = new SmartphoneCreator();
        Device newSmartphone = smartphoneCreator.factoryMethod("realme");
        newSmartphone.powerOn();

        Creator laptopCreator = new LaptopCreator();
        Device newLaptop = laptopCreator.factoryMethod("asus");
        newLaptop.powerOn();

        Creator tabletCreator = new TabletCreator();
        Device newTablet = tabletCreator.factoryMethod("Samsung");
        newTablet.powerOn();
    }
}


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 1: Laptop 2: Tablet 3: Smartphone");
//        int input = scanner.nextInt();
//        if (input == 1) {
//            LaptopCreator laptopCreator = new LaptopCreator();
//            Device newLaptop = laptopCreator.factoryMethod();
//            newLaptop.powerOn();
//        } else if (input == 2) {
//            TabletCreator tabletCreator = new TabletCreator();
//            Device newTablet = tabletCreator.factoryMethod();
//            newTablet.powerOn();
//        } else if (input == 3) {
//            SmartphoneCreator smartphoneCreator = new SmartphoneCreator();
//            Device newSmartphone = smartphoneCreator.factoryMethod();
//            newSmartphone.powerOn();
//
//        } else {
//            System.out.println("wrong input");
//        }