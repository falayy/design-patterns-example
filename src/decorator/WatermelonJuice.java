package decorator;

public class WatermelonJuice implements Juice{

    @Override
    public String drink() {
        return "Watermelon flavour";
    }

    @Override
    public int cost() {
        return 5;
    }

}
