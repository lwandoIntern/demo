package good;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFeesTest {

    private CalculateFees calculateFees;
    @Before
    public void setUp() throws Exception {
        calculateFees = new CalculateFees();
    }

    @Test
    public void getMonthly_fee() {
        Assert.assertEquals(calculateFees.getMonthly_fee(),calculateFees.getMonthly_fee(),0);
    }

    @Test
    public void deductFee() {
        Assert.assertEquals(calculateFees.deductFee(1000),calculateFees.deductFee(1000),0);
    }

    @Test
    public void balance() {
        Assert.assertEquals(calculateFees.balance(1000),calculateFees.balance(1000),0);
    }
}