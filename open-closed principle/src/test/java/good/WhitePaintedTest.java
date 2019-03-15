package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WhitePaintedTest {

    private WhitePainted whitePainted;
    @Before
    public void setUp() throws Exception {
        whitePainted = new WhitePainted();
    }

    @Test
    public void painted() {
        Assert.assertEquals("The house is white",whitePainted.painted());
    }
}