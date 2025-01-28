public class Mage extends Character{
    @Override
    protected void startTurn() {
        System.out.println("Starting mage turn...");
    }

    @Override
    protected void performAction() {
        System.out.println("Performing mage action...");
    }

    @Override
    protected void endTurn() {
        System.out.println("Ending mage turn...");

    }
}
