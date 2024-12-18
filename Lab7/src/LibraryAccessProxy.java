public class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realLibraryAccess;


    @Override
    public boolean accessItem(String itemID, User user) {
        if (realLibraryAccess == null) {
            realLibraryAccess = new RealLibraryAccess(user, user.getAccessList());
        }
        return realLibraryAccess.accessItem(itemID, user);
    }
}
