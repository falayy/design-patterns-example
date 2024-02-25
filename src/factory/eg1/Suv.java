package factory.eg1;

public class Suv implements Vehicle {

    public static final String DESCRIPTION = "Creating SUV Vehicle";

    @Override
    public String createVehicle(VehicleType type) {
        return DESCRIPTION;
    }
}
