package za.ac.edu.org.pentec;



public abstract class Transportation {
    private String name;
    private double speed;
    private String starter;




    public Transportation(String name, double speed,String starter) {
        this.name = name;
        this.speed = speed;
        this.starter = starter;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
    public String getStarter() {
        return starter;
    }

    public abstract String startEngine();
}
