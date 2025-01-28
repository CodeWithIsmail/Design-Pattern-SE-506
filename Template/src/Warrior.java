public class Warrior extends Character{
    @Override
    protected void startTurn() {
        System.out.println("Starting warrior turn...");
        
    }

    @Override
    protected void performAction() {
        System.out.println("Performing warrior action...");

    }

    @Override
    protected void endTurn() {
        System.out.println("Ending warrior turn...");

    }
}
