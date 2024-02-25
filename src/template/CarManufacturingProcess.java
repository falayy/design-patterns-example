package template;

public abstract class CarManufacturingProcess {

    public final void manufactureCar() {
        initializeManufacturing();
        startManufacturing();
        completeManufacturing();
    }

    private void initializeManufacturing() {
        System.out.println("Preparation for manufacturing.");
    }

    protected abstract void startManufacturing();

    private void completeManufacturing() {
        System.out.println("Car manufacturing completed.");
    }
}
