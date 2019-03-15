package interfaces;

public class Student implements Person{

    private String name;
    private String lastName;
    private String home;

    public Student(String name, String lastName, String home) {
        this.name = name;
        this.lastName = lastName;
        this.home = home;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String home() {
        return home;
    }
}
