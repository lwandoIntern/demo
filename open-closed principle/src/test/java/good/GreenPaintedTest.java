package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreenPaintedTest {

    private GreenPainted green;
    @Before
    public void setUp() throws Exception {
        green = new GreenPainted();
    }

    @Test
    public void painted() {
        Assert.assertEquals("The house is green",green.painted());
    }
}