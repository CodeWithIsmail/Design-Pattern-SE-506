public class Main {
    private static Character master;

    public static void main(String[] args) {
        Character warrior = new Warrior();
        warrior.takeTurn();

        Character master = new Mage();
        master.takeTurn();
    }
}

