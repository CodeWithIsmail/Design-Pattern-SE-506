public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robot1", new AggressiveBehavior());
        Robot robot2 = new Robot("Robot2", new DefensiveBehavior());
        Robot robot3 = new Robot("Robot3", new NormalBehavior());

        robot1.performBehavior();
        robot2.performBehavior();
        robot3.performBehavior();

        robot2.updateContextInfo("Position(5, 15)", "Obstacle nearby");
        robot2.setBehavior(new AggressiveBehavior());
        robot2.performBehavior();

        robot3.updateContextInfo("Position(20, 30)", "Clear path");
        robot3.setBehavior(new DefensiveBehavior());
        robot3.performBehavior();

        robot1.updateContextInfo("Position(10, 20)", "No obstacles");
        robot1.setBehavior(new NormalBehavior());
        robot1.performBehavior();
    }
}