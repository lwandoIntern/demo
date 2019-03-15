package za.ac.edu.org.pentec;

public class Project {
    private BackEndDeveloper backEnd;
    private FrontEndDeveloper frontEnd;

    public Project() {
        this.backEnd = new BackEndDeveloper();
        this.frontEnd = new FrontEndDeveloper();
    }

    public String implement() {
        return "Frond end: "+frontEnd.writeJavascript() + ", Back end: "+ backEnd.writeJava();
    }
}
