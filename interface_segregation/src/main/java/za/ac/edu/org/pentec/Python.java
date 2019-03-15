package za.ac.edu.org.pentec;

public class Python implements Snake{
    @Override
    public String poisonous() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String movement() {
        return "Slither";
    }

    @Override
    public boolean aggressive() {
        return false;
    }

    @Override
    public boolean fast() {
        return false;
    }

    @Override
    public String poisonDelivery() {
        throw new UnsupportedOperationException();
    }
}
