import java.util.ArrayList;
import java.util.List;

public class Folder implements Task {
    private String name;
    private List<Task> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(Task item) {
        items.add(item);
    }


    @Override
    public void search(String keyword) {
        System.out.println("Searching in folder: " + name);
        for (Task item : items) {
            item.search(keyword);
        }
    }
}
