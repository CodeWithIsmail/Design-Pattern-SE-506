public abstract class Product {
    private String name;
    private String category;
    private double price;

    public Product() {
    }

    public Product(Product target) {
        if (target != null) {
            this.name = target.name;
            this.category = target.category;
            this.price = target.price;
        }
    }

    public abstract Product clone();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
