package factory.eg1;

public class Truck implements Vehicle {

    public static final String DESCRIPTION = "Creating Truck Vehicle";

    @Override
    public String createVehicle(VehicleType type) {
        return DESCRIPTION;
    }
}
