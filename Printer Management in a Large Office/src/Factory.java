import java.util.HashMap;

public class Factory {

    private static Factory instance;
    HashMap<String, Printer> printerPointer = new HashMap<String, Printer>();

    public static Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }


    void createPrinter(String deptName) {
        Printer newPrinter = new Printer(deptName);
        printerPointer.put(deptName, newPrinter);
    }

    Printer checkRegister(String deptName) {
        Printer printer;
        if (!printerPointer.containsKey(deptName)) {
            createPrinter(deptName);
        }
        printer = printerPointer.get(deptName);
        return printer;
    }
}
