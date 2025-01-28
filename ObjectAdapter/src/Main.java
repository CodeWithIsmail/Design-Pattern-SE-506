public class Main {
    public static void main(String[] args) {
        ModernPrinter modernPrinter = new NewPrinter();
        modernPrinter.print("Modern printer document");

        // Legacy printer usage through adapter
        LegacyPrinter oldPrinter = new OldPrinter();
        ModernPrinter adaptedPrinter = new PrinterAdapter(oldPrinter);
        adaptedPrinter.print("Legacy printer document");

    }
}