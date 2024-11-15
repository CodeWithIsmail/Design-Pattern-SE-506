public class SandwitchManualBuilder implements Builder {
    private String typeOfBread;
    private String filling;
    private String spread;

    @Override
    public void setType(String typeName) {
        this.typeOfBread = typeName;

    }

    @Override
    public void setFilling(String filling) {
        this.filling = filling;

    }

    @Override
    public void setSpread(String spread) {
        this.spread = spread;

    }

    public Manual getResult() {
        return new Manual(typeOfBread, filling, spread);
    }
}
