public class ProxyImage implements Image{
    public String imgName;
    RealImage realImage;

    public ProxyImage(String imgName) {
        this.imgName = imgName;
    }

    @Override
    public void display() {
        if(realImage==null)
            realImage=new RealImage(imgName);
        realImage.display();
    }
}
