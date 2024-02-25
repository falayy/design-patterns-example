package decorator;

public class PineAppleFlavour implements Juice {
    Juice juice;

    public PineAppleFlavour(Juice juice) {
        this.juice = juice;
    }


    @Override
    public String drink() {
        return "pine apple " + juice.drink();
    }


    @Override
    public int cost() {
        return juice.cost() + 4;
    }
}
