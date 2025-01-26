public class Robot {
    private String name;
    private RobotBehavior behavior;

    public Robot(String name, RobotBehavior behavior) {
        this.name = name;
        this.behavior = behavior;
    }

    public void setBehavior(RobotBehavior behavior) {
        this.behavior = behavior;
    }

    public void performBehavior() {
        System.out.print(name + ": ");
        behavior.execute();
    }

    public void updateContextInfo(String position, String nearbyObstacles) {
        System.out.println(name + " updated context: Position=" + position + ", Obstacles=" + nearbyObstacles);
    }
}
