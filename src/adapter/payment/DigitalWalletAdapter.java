package adapter.payment;

public class DigitalWalletAdapter implements PaymentProcessor {
    private DigitalWallet binanceWallet;

    public DigitalWalletAdapter(DigitalWallet binanceWallet) {
        this.binanceWallet = binanceWallet;
    }

    @Override
    public void processPayment() {
        binanceWallet.makePaymentFromWallet();
    }
}
