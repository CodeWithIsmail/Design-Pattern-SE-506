public class Main {

    public static void main(String[] args) {
        // Using a ModernPrinter
        Printer modernPrinter = new ModernPrinter();
        modernPrinter.printDocument("Modern Document");

        // Using a LegacyPrinter with the adapter
        Printer legacyPrinter = new LegacyPrinterAdapter();
        legacyPrinter.printDocument("Legacy Document");

        // Both are treated as the same type
    }
}