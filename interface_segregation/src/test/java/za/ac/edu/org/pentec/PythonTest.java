package za.ac.edu.org.pentec;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PythonTest {

    private Python python;
    @Before
    public void setUp() throws Exception {
        python = new Python();
    }

    @Test
    public void poisonous() {
        Assert.assertEquals(python.poisonous(),python.poisonous());
    }

    @Test
    public void movement() {
        Assert.assertEquals(python.movement(),python.movement());
    }

    @Test
    public void aggressive() {
        Assert.assertEquals(python.aggressive(),python.aggressive());
    }

    @Test
    public void fast() {
        Assert.assertEquals(python.fast(),python.fast());
    }

    @Test
    public void poisonDelivery() {
        Assert.assertEquals(python.poisonDelivery(),python.poisonDelivery());
    }
}