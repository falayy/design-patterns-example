package observer;

public interface WhatsApp {
    void addFriend(PictureObserver observer);
    void removeFriend(PictureObserver observer);
    void notifyFriends();
}
