package factory.eg2;

public class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}


class Iphone {
    // You can add properties and methods specific to the Iphone here
    @Override
    public String toString() {
        return "This is an iPhone!";
    }
}

// Define the IphoneFactory class
class IphonesFactory {

    // Method to create an Iphone
    public Iphone createIphone() {
        return new Iphone();
    }

    // Method to distribute iPhones
    public void distributeIphones() {
        System.out.println("Distributing iPhones");
    }
}