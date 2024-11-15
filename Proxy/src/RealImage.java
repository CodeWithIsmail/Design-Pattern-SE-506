public class RealImage implements Image {
    public String imgName;

    public RealImage(String imgName) {
        this.imgName = imgName;
        loadImgDisk();
    }

    public void loadImgDisk() {
        System.out.println("image loaded from disk: " + imgName);
    }

    @Override
    public void display() {
        System.out.println("image displaying: " + imgName);
    }
}
