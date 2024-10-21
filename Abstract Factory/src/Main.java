public class Main {
    public static void main(String[] args) {
        Factory modernFactory = new ModernFactory();
        Factory rusticFactory = new RusticFactory();
        Factory victorianFactory = new VictorianFactory();

        Chair modernChair = modernFactory.createChair();
        Sofa rusticSofa = rusticFactory.createSofa();
        Table victorianTable = victorianFactory.createTable();

        modernChair.createChair();
        rusticSofa.createSofa();
        victorianTable.createTable();


    }
}