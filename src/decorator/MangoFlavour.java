package decorator;

public class MangoFlavour implements Juice {
    Juice juice;

    public MangoFlavour(Juice juice) {
        this.juice = juice;
    }


    @Override
    public String drink() {
        return "mango " + juice.drink();
    }

    @Override
    public int cost() {
        return juice.cost() + 2;
    }
}
