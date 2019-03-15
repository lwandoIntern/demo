package good;

public class BackEnd implements Developer{
    public String writeJava() {
        return "Writing Java";
    }

    @Override
    public String develop() {
        return writeJava();
    }
}
