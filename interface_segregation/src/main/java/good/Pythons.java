package good;

public class Pythons implements Snakes,ConstrictingSnake{
    @Override
    public String movement() {
        return "Slither";
    }

    @Override
    public boolean fast() {
        return false;
    }

    @Override
    public boolean aggressive() {
        return false;
    }

    @Override
    public String kill_style() {
        return "Constriction";
    }
}
