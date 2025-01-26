public class File implements Task{

    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching in file: " + name);
        if (content.contains(keyword)) {
            System.out.println("Keyword found in file: " + name);
        }
    }
}
