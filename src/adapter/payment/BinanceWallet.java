package adapter.payment;

public class BinanceWallet implements DigitalWallet{
    @Override
    public void makePaymentFromWallet() {
        System.out.println("making payment from my binance wallet");
    }
}
