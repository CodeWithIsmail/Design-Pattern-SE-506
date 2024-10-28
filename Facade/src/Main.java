public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.paymentOrder("12345678", "190225", 1000, "order pizza");
    }

}