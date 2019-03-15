package good;

public class House {
    private Painted painted;

    public House(Painted painted) {
        this.painted = painted;
    }

    public String painted(){
        return this.painted.painted();
    }
}
