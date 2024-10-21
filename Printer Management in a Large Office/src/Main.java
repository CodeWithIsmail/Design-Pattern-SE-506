public class Main {
    public static void main(String[] args) {

        Factory printerFactory1 = Factory.getInstance();

        Printer iitPrinter1 = printerFactory1.checkRegister("IIT");
        iitPrinter1.showPrinterInfo();

        Printer iitPrinter2 = printerFactory1.checkRegister("IIT");
        iitPrinter2.showPrinterInfo();

        Printer csePrinter1 = printerFactory1.checkRegister("CSE");
        csePrinter1.showPrinterInfo();

        Factory printerFactory2 = Factory.getInstance();

        Printer iitPrinter3 = printerFactory2.checkRegister("IIT");
        iitPrinter3.showPrinterInfo();



//        Factory printerFactory = new Factory();

//        Printer csePrinter = printerFactory.checkRegister("CSE");
//        csePrinter.showPrinterInfo();
//        System.out.println(csePrinter.hashCode());
//
//
//        Printer iitPrinter2 = printerFactory.checkRegister("IIT");
//        iitPrinter2.showPrinterInfo();
//        System.out.println(iitPrinter2.hashCode());
//        iitPrinter2.printDocument("file1");


    }
}