package good;

public abstract class DeviceWithoutEngine extends TransportationDevice{
    public DeviceWithoutEngine(double speed, String name) {
        super(speed, name);
    }

    public abstract String move();
}
