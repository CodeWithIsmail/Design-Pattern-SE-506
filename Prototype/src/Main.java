public class Main {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();

        ClothProduct clothProduct = new ClothProduct();
        clothProduct.setName("cloth1");
        clothProduct.setCategory("category1");
        clothProduct.setPrice(200);
        clothProduct.size = "20";
        clothProduct.color = "blue";

        ClothProduct clothProduct2 = (ClothProduct) clothProduct.clone();
        clothProduct2.size = "30";
        clothProduct2.color = "red";

        ElectronicsProduct electronicsProduct=new ElectronicsProduct();
        

        prototypeRegistry.addNewProduct(clothProduct.getName(), clothProduct);
        prototypeRegistry.addNewProduct(clothProduct.getName(), clothProduct2);

        if (clothProduct != clothProduct2) {
            System.out.println("cloth product are different objects ");
            if (clothProduct.equals(clothProduct2)) {
                System.out.println(" And they are identical ");
            } else {
                System.out.println(" But they are not identical ");
            }
        } else {
            System.out.println(" cloth products objects are the same ");
        }

    }
}
