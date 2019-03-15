package good;

public class FrondEnd implements Developer{
    public String writeJavascript() {
        return "Writing JavaScript";
    }

    @Override
    public String develop() {
        return writeJavascript();
    }
}
