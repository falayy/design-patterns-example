package mediator;

public class User {
    private String name;
    private ChatRoomMediator chatMediator;

    public User(String name, ChatRoomMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void send(String message) {
        chatMediator.showMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}