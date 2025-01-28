class OldPrinter implements LegacyPrinter {
    public void printDocument(String text) {
        System.out.println("Printing with old printer: " + text);
    }
}