package decorator;

public class OrangeFlavour implements Juice {
    Juice juice;

    public OrangeFlavour(Juice juice) {
        this.juice = juice;
    }

    @Override
    public String drink() {
        return "orange " + juice.drink() ;
    }

    @Override
    public int cost() {
        return juice.cost() + 7;
    }
}
