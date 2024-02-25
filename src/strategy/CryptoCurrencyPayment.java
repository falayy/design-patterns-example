package strategy;

public class CryptoCurrencyPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoCurrencyPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using cryptocurrency to the wallet: " + walletAddress);
    }
}
