import java.util.Set;

public class User {
    private String uname;
    private Set<String> accessList;

    public User(String uname, Set<String> accessList) {
        this.uname = uname;
        this.accessList = accessList;
    }

    public String getUname() {
        return uname;
    }

    public void addAccess(String newId) {
        accessList.add(newId);
    }

    public void removeAccess(String id) {
        accessList.remove(id);
    }

    public Set<String> getAccessList() {
        return accessList;
    }
}



