package good;

public class Bike extends DeviceWithoutEngine{
    public Bike(double speed, String name) {
        super(speed, name);
    }

    @Override
    public String move() {
        return "Moving...";
    }
}
