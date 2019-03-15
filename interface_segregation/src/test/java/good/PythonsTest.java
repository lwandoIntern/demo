package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PythonsTest {

    private Pythons pythons;
    @Before
    public void setUp() throws Exception {
        pythons = new Pythons();
    }

    @Test
    public void movement() {
        Assert.assertEquals("Slither",pythons.movement());
    }

    @Test
    public void fast() {
        Assert.assertEquals(false,pythons.fast());
    }

    @Test
    public void aggressive() {
        Assert.assertEquals(false,pythons.aggressive());
    }

    @Test
    public void kill_style() {
        Assert.assertEquals("Constriction",pythons.kill_style());
    }
}