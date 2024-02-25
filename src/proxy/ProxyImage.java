package proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {

    private final Map<String, String> imageCache = new HashMap<>();

    @Override
    public void loadImage(String fileName) {
        if (imageCache.containsKey(fileName)) {
            String image = imageCache.get(fileName);
            System.out.println("Loading Image From cache : " + image);
        } else {
            RemoteImage remoteImage = new RemoteImage();
            remoteImage.loadImage(fileName);
            imageCache.put(fileName, fileName+".png");
            System.out.println("No Image From Cache... Loading From remote" + remoteImage);

        }
    }
}
