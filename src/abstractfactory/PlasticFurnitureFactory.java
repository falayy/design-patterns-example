package abstractfactory;

public class PlasticFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Wardrobe createWardrobe() {
        return new PlasticWardrobe();
    }
}
