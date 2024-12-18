public class Book implements LibraryItem {
    private String itemId;
    private String title;
    private String author;


    public Book(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return " ItemId: "+itemId+" Title: " + title + " author: " + author;
    }

    @Override
    public boolean borrowItem() {
        System.out.println("borrowed ");
        return true;
    }
}
