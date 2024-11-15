public class LegacyPrinter implements Printer {
    @Override
    public void printDoc(String fname) {
        System.out.println(fname + " printed by legacy printer");
    }
}
