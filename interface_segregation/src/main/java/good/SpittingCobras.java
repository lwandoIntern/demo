package good;

public class SpittingCobras implements PoisonousSnake,Snakes{

    @Override
    public String poison() {
        return "Cytotoxic Venom";
    }

    @Override
    public String poisonDelivery() {
        return "Upwards Projection";
    }

    @Override
    public String movement() {
        return "Slither";
    }

    @Override
    public boolean fast() {
        return true;
    }

    @Override
    public boolean aggressive() {
        return true;
    }
}
