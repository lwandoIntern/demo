package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    private Vehicle vehicle;
    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle(180,"Rover");
    }

    @Test
    public void startEngine() {
        Assert.assertEquals(vehicle.startEngine(),vehicle.startEngine());
    }
}