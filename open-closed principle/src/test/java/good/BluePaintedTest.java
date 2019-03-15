package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BluePaintedTest {

    private BluePainted blue;
    @Before
    public void setUp() throws Exception {
        blue = new BluePainted();
    }

    @Test
    public void painted() {
        Assert.assertEquals("The house is blue",blue.painted());
    }
}