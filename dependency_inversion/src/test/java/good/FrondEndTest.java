package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrondEndTest {

    private FrondEnd frondEnd;
    @Before
    public void setUp() throws Exception {
        frondEnd = new FrondEnd();
    }

    @Test
    public void writeJavascript() {
        Assert.assertEquals(frondEnd.writeJavascript(),frondEnd.writeJavascript());
    }

    @Test
    public void develop() {
        Assert.assertEquals(frondEnd.develop(),frondEnd.develop());
    }
}