package state;

class DispensingState implements VendingMachineState {
    @Override
    public void selectProduct() {
        System.out.println("Product dispensing is in progress. Please wait.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product dispensing is in progress. Please wait.");
    }
}
