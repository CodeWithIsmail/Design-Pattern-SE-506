public class Rectangle extends Shape{
    public Rectangle() {
        setName("rectangle");
    }

    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}
