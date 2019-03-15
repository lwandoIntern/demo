package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class HouseTest {

    private MockHouse mockHouse;
    private House house;
    @Before
    public void setUp() throws Exception {
        mockHouse = new MockHouse();
        house = new House(mockHouse);

    }

    @Test(timeout = 10000)
    public void painted() {
        Assert.assertEquals("Orange",house.painted());
    }
}

class MockHouse implements Painted{

    @Override
    public String painted() {
        return "Orange";
    }
}