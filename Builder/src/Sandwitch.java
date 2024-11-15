public class Sandwitch {
    private String typeOfBread;
    private String filling;
    private String spread;

    public Sandwitch(String typeOfBread, String filling, String spread) {
        this.typeOfBread = typeOfBread;
        this.filling = filling;
        this.spread = spread;
    }

    public String getTypeOfBread() {
        return typeOfBread;
    }

    public String getFilling() {
        return filling;
    }

    public String getSpread() {
        return spread;
    }

    public void setTypeOfBread(String typeOfBread) {
        this.typeOfBread = typeOfBread;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public void displayInfo() {
        System.out.println(this.typeOfBread + " " + this.filling + " " + this.spread);
    }
}
