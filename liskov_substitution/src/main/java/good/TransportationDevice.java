package good;

public class TransportationDevice {
    private double speed;
    private String name;

    public TransportationDevice(double speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
