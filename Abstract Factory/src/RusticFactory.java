public class RusticFactory implements Factory {
    @Override
    public Chair createChair() {
        return new RusticChair();
    }

    @Override
    public Table createTable() {
        return new RusticTable();
    }

    @Override
    public Sofa createSofa() {
        return new RusticSofa();
    }
}
