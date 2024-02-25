package facade;

public class Food {

    private String name;
    private int pieces;

    public Food(String name, int pieces) {
        this.name = name;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", pieces=" + pieces +
                '}';
    }
}
