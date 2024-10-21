public class ModernFactory implements Factory {
//    private static volatile ModernFactory instance;
//
//    ModernFactory() {
//    }
//
//    public static ModernFactory getInstance() {
//
//        ModernFactory result = instance;
//        if (result != null) {
//            return result;
//        }
//        synchronized (ModernFactory.class) {
//            if (instance == null) {
//                instance = new ModernFactory();
//            }
//            return instance;
//        }
//    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
