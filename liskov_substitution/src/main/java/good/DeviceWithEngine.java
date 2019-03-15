package good;

public abstract class DeviceWithEngine extends TransportationDevice{

    public DeviceWithEngine(double speed, String name) {
        super(speed, name);

    }
    public abstract String startEngine();
}
