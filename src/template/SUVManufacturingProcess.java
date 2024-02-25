package template;

public class SUVManufacturingProcess extends CarManufacturingProcess {

    @Override
    protected void startManufacturing() {
        System.out.println("Manufacturing SUV: Assembling chassis, Installing heavy-duty engine, and Painting with durable paint.");
    }
}