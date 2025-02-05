public class Main {
    public static void main(String[] args) {

        Employee engineer = new Engineer(5000);
        Employee salesman = new Salesman(3000, 1000);
        Employee manager = new Manager(7000, 2000);

        System.out.println(engineer.payAmount());
        System.out.println(salesman.payAmount());
        System.out.println(manager.payAmount());
    }
}