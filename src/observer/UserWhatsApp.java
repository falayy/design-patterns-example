package observer;

import java.util.ArrayList;
import java.util.List;

public class UserWhatsApp implements WhatsApp {
    private final List<PictureObserver> observers = new ArrayList<>();
    private String profilePicture = "default.jpg";

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
        notifyFriends();
    }

    @Override
    public void addFriend(PictureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeFriend(PictureObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyFriends() {
        for(PictureObserver friend : observers) {
            friend.updatePicture(profilePicture);
        }
    }
}
