package za.ac.edu.org.pentec;

import java.util.ArrayList;

public class Student extends Course{
    private String name;
    private int stundetNumber;
    private String surname;

    public Student(int courseNumber, String courseName, int numberOfModules, ArrayList<String> modules,String name, int stundetNumber, String surname) {
        super(courseNumber,courseName,numberOfModules,modules);
        this.name = name;
        this.stundetNumber = stundetNumber;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public int getStundetNumber() {
        return stundetNumber;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return super.toString()
                +"Student Number: "
                +getStundetNumber()
                +"Sudent name: "
                +getName()
                +"Surname: "
                +getSurname();
    }
}
