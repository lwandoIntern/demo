package good;

public class Vehicle extends DeviceWithEngine{
    private String starter;

    public Vehicle(double speed, String name) {
        super(speed, name);
    }

    @Override
    public String startEngine() {
        return "Starting... speed increased to "+super.getSpeed();
    }
}
