package abstractfactory;

public class WoodenFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

    @Override
    public Table createTable() {
        return new WoodenTable();
    }

    @Override
    public Wardrobe createWardrobe() {
        return new WoodenWardrobe();
    }
}
