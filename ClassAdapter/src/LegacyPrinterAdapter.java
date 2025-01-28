public class LegacyPrinterAdapter extends LegacyPrinter implements Printer {
    @Override
    public void printDocument(String document) {
        // Delegate the call to the legacy method
        printLegacy(document);
    }
}