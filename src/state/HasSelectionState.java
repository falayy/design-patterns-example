package state;

class HasSelectionState implements VendingMachineState {
    @Override
    public void selectProduct() {
        System.out.println("Product already selected.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Dispensing the selected product.");
    }
}