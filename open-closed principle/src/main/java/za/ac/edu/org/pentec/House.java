package za.ac.edu.org.pentec;

public class House {
    private String paint;

    public String painted(){
        if ("Red".equals(this.paint)) {
            return "The house is red";
        } else if ("Green".equals(this.paint)) {
            return "The house is green";
        } else if ("Blue".equals(this.paint)) {
            return "The house is blue";
        }
        return "The house is white";
    }

    public void setPaint(String paint){
        this.paint = paint;
    }
}
