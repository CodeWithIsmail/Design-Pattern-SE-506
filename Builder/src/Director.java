public class Director {
    public void createChickenSandwitch(Builder builder) {
        builder.setType("regular bread");
        builder.setFilling("grilled chicken");
        builder.setSpread("cheese");
    }

    public void createEggSandwitch(Builder builder) {
        builder.setType("toasted bread");
        builder.setFilling("fried egg");
        builder.setSpread("sauce");
    }

}
