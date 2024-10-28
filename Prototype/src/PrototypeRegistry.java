import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Product> cache = new HashMap<>();

    public PrototypeRegistry() {

    }

    public void addNewProduct(String key, Product prototypeShape) {
        cache.put(key, prototypeShape);
    }

    public Product getProduct(String key) {
        return cache.get(key).clone();
    }
}





