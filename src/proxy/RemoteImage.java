package proxy;

public class RemoteImage implements Image {
    @Override
    public void loadImage(String fileName) {
        System.out.println("Loading From Url..." + fileName +".png");
    }
}
