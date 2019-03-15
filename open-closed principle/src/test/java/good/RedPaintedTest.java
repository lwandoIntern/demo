package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedPaintedTest {

    private RedPainted red;
    @Before
    public void setUp() throws Exception {
        red = new RedPainted();
    }

    @Test
    public void painted() {
        Assert.assertEquals("The house is red",red.painted());
    }
}