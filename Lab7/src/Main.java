import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> emptySet = new HashSet<>();

        LibraryConfigManager configManager = LibraryConfigManager.getInstance(1000, 10, "10 AM - 5 PM");
        LibraryConfigManager configManager2 = LibraryConfigManager.getInstance(9000, 100, "10 AM - 5 PM");

        System.out.println("lateFees= " + configManager.getLateFees() +
                ", borrowingLimit= " + configManager.getBorrowingLimit() +
                ", openingHours= " + configManager.getOpeningHours());
        System.out.println("lateFees= " + configManager2.getLateFees() +
                ", borrowingLimit= " + configManager2.getBorrowingLimit() +
                ", openingHours= " + configManager2.getOpeningHours());

        User user1 = new User("ismail", emptySet);
        User user2 = new User("hossain", emptySet);

        Creator bookCreator = new BookCreator();
        Creator magazineCreator = new MagazineCreator();

        user1.addAccess("123");
        user1.addAccess("129");
        user2.addAccess("124");
        user2.addAccess("126");


        LibraryAccessProxy proxy = new LibraryAccessProxy();

        if (proxy.accessItem("123", user1)) {
            Creator bookcreator = new BookCreator();
            LibraryItem book1 = bookcreator.factoryMethod("123", "sherlock holmes", "arther doel");
        } else {
            System.out.println("No access");
        }
        if (proxy.accessItem("12", user2)) {
            Creator bookcreator = new BookCreator();
            LibraryItem book1 = bookcreator.factoryMethod("123", "sherlock holmes", "arther doel");
        } else {
            System.out.println("No access");
        }



    }
}


//        LibraryItem book1 = new Book("123", "sherlock holmes", "arther doel");
//        LibraryItem book2 = new Book("124", "Feluda", "satyajit roy");
//        LibraryItem magazine1 = new Book("126", "kishor alo", "prothom alo");
//        LibraryItem magazine2 = new Book("129", "biggan chinta", "prothom alo");
