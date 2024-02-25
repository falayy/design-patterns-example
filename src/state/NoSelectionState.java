package state;

public class NoSelectionState implements VendingMachineState {
    @Override
    public void selectProduct() {
        System.out.println("Product selected. Ready to dispense.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first.");
    }
}