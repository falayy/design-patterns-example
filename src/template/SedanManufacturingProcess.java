package template;

public class SedanManufacturingProcess extends CarManufacturingProcess {

    @Override
    protected void startManufacturing() {
        System.out.println("Manufacturing Sedan: Assembling body, Installing engine, and Painting.");
    }
}