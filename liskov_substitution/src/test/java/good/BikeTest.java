package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {

    private Bike bike;
    @Before
    public void setUp() throws Exception {
        bike = new Bike(15.5,"Mountain");
    }

    @Test
    public void move() {
        Assert.assertEquals(bike.move(),bike.move());
    }
}