import java.util.Set;

public class RealLibraryAccess implements LibraryAccess {
    User user;
    Set<String> accessList;

    public RealLibraryAccess(User user, Set<String> accessList) {
        this.user = user;
        this.accessList = accessList;
        loadAccessList(user);
    }

    public void loadAccessList(User user) {
        accessList = user.getAccessList();
    }

    @Override
    public boolean accessItem(String itemID, User user) {
        loadAccessList( user);
//        System.out.println("Accessing item with ID: " + itemID + " by user " + user.getUname());
        return accessList.contains(itemID);
    }
}








