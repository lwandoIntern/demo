package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpittingCobraTest {

    private SpittingCobra cobra;
    @Before
    public void setUp() throws Exception {
        cobra = new SpittingCobra();
    }

    @Test
    public void poisonous() {
        Assert.assertEquals(cobra.poisonous(),cobra.poisonous());
    }

    @Test
    public void movement() {
        Assert.assertEquals(cobra.movement(),cobra.movement());
    }

    @Test
    public void aggressive() {
        Assert.assertEquals(cobra.aggressive(),cobra.aggressive());
    }

    @Test
    public void fast() {
        Assert.assertEquals(cobra.fast(),cobra.fast());
    }

    @Test
    public void poisonDelivery() {
        Assert.assertEquals(cobra.poisonDelivery(),cobra.poisonDelivery());
    }
}