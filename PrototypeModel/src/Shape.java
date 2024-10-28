abstract class Shape implements Cloneable {
    private String name;
    private String id;

    abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
        }
        return clone;
    }
}
