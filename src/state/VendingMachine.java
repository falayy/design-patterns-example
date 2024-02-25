package state;

public class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
            state = new NoSelectionState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void selectProduct() {
        state.selectProduct();
        setState(new HasSelectionState());
    }

        public void dispenseProduct() {
            state.dispenseProduct();
            if (state instanceof HasSelectionState) {
                setState(new DispensingState());
                setState(new NoSelectionState());
            }
        }

}
