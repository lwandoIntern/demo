package za.ac.edu.org.pentec;

public class Car extends Transportation{

    public Car(String name, double speed, String starter) {
        super(name, speed, starter);
    }

    @Override
    public String startEngine() {
        return "Starting...";
    }


}
