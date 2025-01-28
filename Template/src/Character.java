abstract class Character {
    public void takeTurn(){
        startTurn();
        performAction();
        endTurn();

    }
    protected abstract void startTurn();
    protected abstract void performAction();
    protected abstract void endTurn();
}
