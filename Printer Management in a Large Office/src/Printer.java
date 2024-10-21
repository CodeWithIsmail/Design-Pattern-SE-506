import java.util.HashMap;

public class Printer {
    public String deptName;
    HashMap<String, Printer> printerPointer = new HashMap<String, Printer>();

    public Printer(String deptName) {
        this.deptName = deptName;
    }

    public void showPrinterInfo() {
        System.out.println("This is " + deptName + " printer. ID: " + this.hashCode());
    }

    public void printDocument(String filename) {
        System.out.println(filename + " is printed");
    }
}
