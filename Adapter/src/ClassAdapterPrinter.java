public class ClassAdapterPrinter extends ModernPrinter implements Printer {
    @Override
    public void printDoc(String fname) {
        printNew(fname);
    }
}
