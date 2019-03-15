package good;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BanksTest {

    private Banks banks;

    @Before
    public void setUp() throws Exception {
        banks = new Banks
                .Builder()
                .accName("Savings")
                .accNum(1000544478)
                .branchCode(41007)
                .branchName("Stelenbosch")
                .holderName("Lwando")
                .holderSurname("Skoti")
                .build();
    }

    @Test
    public void getAccName() {
        Assert.assertEquals(banks.getAccName(),banks.getAccName());
    }

    @Test
    public void getAccNum() {
        Assert.assertEquals(banks.getAccNum(),banks.getAccNum());
    }

    @Test
    public void getHolderName() {
        Assert.assertEquals(banks.getHolderName(),banks.getHolderName());
    }

    @Test
    public void getHolderSurname() {
        Assert.assertEquals(banks.getHolderSurname(),banks.getHolderSurname());
    }

    @Test
    public void getBranchCode() {
        Assert.assertEquals(banks.getBranchCode(),banks.getBranchCode());
    }

    @Test
    public void getBranchName() {
        Assert.assertEquals(banks.getBranchName(),banks.getBranchName());
    }
}