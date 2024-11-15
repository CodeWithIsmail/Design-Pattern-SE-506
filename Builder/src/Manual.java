public class Manual {
    private String typeOfBread;
    private String filling;
    private String spread;

    public Manual(String typeOfBread, String filling, String spread) {
        this.typeOfBread = typeOfBread;
        this.filling = filling;
        this.spread = spread;
    }

    public String showInfo() {
        String info = "Type of bread: " + typeOfBread + "\nType of filling: " + filling + "\ntype of spread: " + spread;
        return info;
    }
}
