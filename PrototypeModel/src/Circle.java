public class Circle extends Shape{
    public Circle() {
        setName("circle");
    }

    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}
