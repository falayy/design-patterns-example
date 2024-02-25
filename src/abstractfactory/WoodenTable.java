package abstractfactory;

public class WoodenTable implements Table {

    @Override
    public String createTable() {
        return "Wooden Table";
    }
}
