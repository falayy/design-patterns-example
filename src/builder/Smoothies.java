package builder;

public class Smoothies {
    private String milk;
    private String pineapple;
    private String ginger;
    private String banana;
    private String mango;
    private String strawberry;

    public Smoothies(String milk, String pineapple, String ginger, String banana, String mango, String strawberry) {
        this.milk = milk;
        this.pineapple = pineapple;
        this.ginger = ginger;
        this.banana = banana;
        this.mango = mango;
        this.strawberry = strawberry;
    }

    public Smoothies(String milk, String pineapple, String ginger) {
        this.milk = milk;
        this.pineapple = pineapple;
        this.ginger = ginger;
    }

    public Smoothies(String milk, String banana, String mango, String strawberry) {
        this.milk = milk;
        this.banana = banana;
        this.mango = mango;
        this.strawberry = strawberry;
    }

    public void buildPineAppleGingerSmoothie() {
        System.out.println("The Smoothie flavours are: " + milk + pineapple + ginger);
    }

    public void buildBananaMangoStrawBerrySmoothie() {
        System.out.println("The Smoothie flavours are: " + milk + banana + strawberry + mango);
    }

}
