package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpittingCobrasTest {

    private SpittingCobras cobras;
    @Before
    public void setUp() throws Exception {
        cobras = new SpittingCobras();
    }

    @Test
    public void poison() {
        Assert.assertEquals("Cytotoxic Venom",cobras.poison());
    }

    @Test
    public void poisonDelivery() {
        Assert.assertEquals("Upwards Projection",cobras.poisonDelivery());
    }

    @Test
    public void movement() {
        Assert.assertEquals("Slither",cobras.movement());
    }

    @Test
    public void fast() {
        Assert.assertEquals(true,cobras.fast());
    }

    @Test
    public void aggressive() {
        Assert.assertEquals(true,cobras.aggressive());
    }
}