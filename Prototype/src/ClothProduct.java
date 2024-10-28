public class ClothProduct extends Product {

    public String color;
    public String size;

    public ClothProduct() {
    }


    public ClothProduct(ClothProduct target) {
        super(target);
        if (target != null) {
            this.color = target.color;
            this.size = target.size;
        }
    }

    @Override
    public Product clone() {
        return new ClothProduct(this);
    }

}
