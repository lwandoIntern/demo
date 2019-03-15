package za.ac.edu.org.pentec;

public class SpittingCobra implements Snake{
    @Override
    public String poisonous() {
        return "Cytotoxic Venom";
    }

    @Override
    public String movement() {
        return "Slither";
    }

    @Override
    public boolean aggressive() {
        return true;
    }

    @Override
    public boolean fast() {
        return true;
    }

    @Override
    public String poisonDelivery() {
        return "Spit";
    }
}
