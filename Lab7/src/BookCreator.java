public class BookCreator implements Creator {
    @Override
    public LibraryItem factoryMethod(String itemId, String title, String author) {
        return new Book(itemId,title, author);
    }


}
