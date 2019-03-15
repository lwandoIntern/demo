package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    private House house;

    @Before
    public void setUp() throws Exception {
        house = new House();
        Assert.assertEquals("The house is white",house.painted());
    }

    @Test
    public void testRedHouse(){
        house.setPaint("Red");
        Assert.assertEquals(house.painted(),house.painted());
    }

    @Test
    public void testGreenHouse(){
        house.setPaint("Green");
        Assert.assertEquals(house.painted(),house.painted());
    }

    @Test
    public void testBlueHouse(){
        house.setPaint("Blue");
        Assert.assertEquals(house.painted(),house.painted());
    }
}