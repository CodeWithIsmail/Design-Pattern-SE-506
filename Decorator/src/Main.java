public class Main {
    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " : " + coffee.getCost());

//        Coffee milkCoffee = new MilkDecorator(coffee);
//        System.out.println(milkCoffee.getDescription() + " : " + milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println(sugarCoffee.getDescription() + " : " + sugarCoffee.getCost());

        Coffee whippedCreamCoffee = new WhippedCreamDecorator(sugarCoffee);
        System.out.println(whippedCreamCoffee.getDescription() + " : " + whippedCreamCoffee.getCost());
    }
}