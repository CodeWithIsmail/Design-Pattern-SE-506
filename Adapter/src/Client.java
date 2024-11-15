public class Client {
    public static void main(String[] args) {
        Printer legacyPrinter = new LegacyPrinter();

        ModernPrinter modernPrinter = new ModernPrinter();
        Printer modernPrinterAdapter = new ModernPrinterAdapter(modernPrinter);

        ClassAdapterPrinter classAdapterPrinter=new ClassAdapterPrinter();

        legacyPrinter.printDoc("file1");
        modernPrinterAdapter.printDoc("file2");
        classAdapterPrinter.printDoc("file3");

    }
}

