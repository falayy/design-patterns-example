package factory.eg2;

public class SamsungFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
