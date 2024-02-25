package abstractfactory;

public class PlasticChair implements Chair {
    @Override
    public String createChair() {
        return "Plastic Chair";
    }
}
