package observer;

public class WhatsAppFriend implements PictureObserver{
    private final String name;

    public WhatsAppFriend(String name) {
        this.name = name;
    }

    @Override
    public void updatePicture(String newProfilePicture) {
        System.out.println(name + " noticed that the profile picture has been updated to " + newProfilePicture);
    }
}
