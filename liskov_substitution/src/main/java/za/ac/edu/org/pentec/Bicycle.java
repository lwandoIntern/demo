package za.ac.edu.org.pentec;

public class Bicycle extends Transportation{
    public Bicycle(String name, double speed, String starter) {
        super(name, speed, starter);
    }

    @Override
    public String startEngine() {//Problem bicycle can't start engine coz it doesn't have it.
        return "Error";
    }
}
