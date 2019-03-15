package za.ac.edu.org.pentec;

import java.util.ArrayList;

public class Course {
    private int courseNumber;
    private String courseName;
    private int numberOfModules;
    private ArrayList<String> modules;

    public Course(int courseNumber, String courseName, int numberOfModules, ArrayList<String> modules) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.numberOfModules = numberOfModules;
        this.modules = modules;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfModules() {
        return numberOfModules;
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    @Override
    public String toString() {
        return "Course Number: "
                +getCourseNumber()
                +"\nCourse Name: "
                +getCourseName()
                +"\nNumber of Modules: "
                +getNumberOfModules()
                +"\nModules: "
                +getModules();
    }
}
