public class ElectronicsProduct extends Product {

    public String capacity;
    public String life;

    public ElectronicsProduct() {
    }

    public ElectronicsProduct(ElectronicsProduct target) {
        super(target);
        if (target != null) {
            this.capacity = target.capacity;
            this.life = target.life;
        }
    }

    @Override
    public Product clone() {
        return new ElectronicsProduct(this);
    }
}
