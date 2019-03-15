package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackEndTest {

    private BackEnd backEnd;
    @Before
    public void setUp() throws Exception {
        backEnd = new BackEnd();
    }

    @Test
    public void writeJava() {
        Assert.assertEquals(backEnd.writeJava(),backEnd.writeJava());
    }

    @Test
    public void develop() {
        Assert.assertEquals(backEnd.develop(),backEnd.develop());
    }
}