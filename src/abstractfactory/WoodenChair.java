package abstractfactory;

public class WoodenChair implements Chair{
    @Override
    public String createChair() {
        return "Wooden Chair";
    }
}
