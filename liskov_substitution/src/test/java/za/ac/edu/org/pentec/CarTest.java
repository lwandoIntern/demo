package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car("Benz",250.77,"Vroom");
    }

    @Test
    public void startEngine() {
        Assert.assertEquals(car.startEngine(),car.startEngine());
    }
}