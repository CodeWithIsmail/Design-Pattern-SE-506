public class ModernPrinterAdapter implements Printer {
   public ModernPrinter modernPrinter;

    public ModernPrinterAdapter(ModernPrinter modernPrinter) {
        this.modernPrinter = modernPrinter;
    }


    @Override
    public void printDoc(String fname) {
        modernPrinter.printNew(fname);
    }
}

