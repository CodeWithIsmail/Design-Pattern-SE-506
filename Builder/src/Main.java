public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        SandwitchBuilder sandwitchBuilder = new SandwitchBuilder();
        director.createChickenSandwitch(sandwitchBuilder);

        Sandwitch sandwitch = sandwitchBuilder.getResult();
        System.out.println("sandwitch built: " + sandwitch.getTypeOfBread());

        SandwitchManualBuilder sandwitchManualBuilder=new SandwitchManualBuilder();

        director.createEggSandwitch(sandwitchManualBuilder);
        Manual sandwitchManual=sandwitchManualBuilder.getResult();
        System.out.println(sandwitchManual.showInfo());
    }
}