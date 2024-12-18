public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFees;
    private int borrowingLimit;
    private String openingHours;

    public double getLateFees() {
        return lateFees;
    }

    public void setLateFees(double lateFees) {
        this.lateFees = lateFees;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public LibraryConfigManager(double lateFees, int borrowingLimit, String openingHours) {
        this.lateFees = lateFees;
        this.borrowingLimit = borrowingLimit;
        this.openingHours = openingHours;
    }

    public static synchronized LibraryConfigManager getInstance(double lateFees, int borrowingLimit, String openingHours) {
        if (instance == null) {
            instance = new LibraryConfigManager(lateFees, borrowingLimit, openingHours);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LibraryConfigManager{" +
                "lateFees=" + this.lateFees +
                ", borrowingLimit=" + this.borrowingLimit +
                ", openingHours='" + this.openingHours + '\'' +
                '}';
    }
}


