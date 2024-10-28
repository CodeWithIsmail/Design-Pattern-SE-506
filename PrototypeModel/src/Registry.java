import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Registry {
    private static Map<String,Shape> shapeMap=new HashMap<>();
    public static Shape getShape(String id)
    {
        Shape shape=shapeMap.get(id);
        return (Shape) shape.clone();
    }

    public static void loadRegistry()
    {
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
