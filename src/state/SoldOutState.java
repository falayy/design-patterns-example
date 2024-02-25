package state;

class SoldOutState implements VendingMachineState {
    @Override
    public void selectProduct() {
        System.out.println("Product is sold out. Please select another product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product is sold out. Cannot dispense.");
    }
}
