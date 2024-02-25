package factory.eg2;

public class PixelFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new PixelSmartPhone();
    }
}
