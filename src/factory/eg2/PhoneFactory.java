package factory.eg2;

public interface PhoneFactory {

    Phone createPhone();

    default void distributePhones() {
        System.out.println("Distributing Smart Phones");
    }
}
