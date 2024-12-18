public class MagazineCreator implements Creator {

    @Override
    public LibraryItem factoryMethod(String itemId, String title, String author) {
        return new Magazine(itemId, title, author);
    }
}
