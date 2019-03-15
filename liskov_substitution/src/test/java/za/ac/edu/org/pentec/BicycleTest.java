package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BicycleTest {

    private Bicycle bicycle;
    @Before
    public void setUp() throws Exception {
        bicycle = new Bicycle("Masguqe",15.5,"Error");
    }

    @Test
    public void startEngine() {
        Assert.assertEquals(bicycle.startEngine(),"Error");
    }
}