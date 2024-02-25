package adapter.plug;

public class PlugAdapter  implements UkOutlet{
    private  UsPlug usPlug;

    public PlugAdapter(UsPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void acceptThreePinPlug() {
        usPlug.insertTwoPinOutlet();;
    }
}
