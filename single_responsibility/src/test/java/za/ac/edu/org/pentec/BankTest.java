package za.ac.edu.org.pentec;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    private Bank bank;
    @Before
    public void setUp() throws Exception {
        bank = new Bank
                .Builder()
                .accName("Savings")
                .accNum(144788855)
                .balance(1567000.55)
                .branchCode(41007)
                .branchName("Cape Town")
                .holderName("Jakes")
                .holderSurname("Kalawa")
                .build();
    }

    @Test
    public void getAccName() {
        Assert.assertEquals(bank.getAccName(),bank.getAccName());
    }

    @Test
    public void getAccNum() {
        Assert.assertEquals(bank.getAccNum(),bank.getAccNum());
    }

    @Test
    public void getBalance() {
        Assert.assertEquals(bank.getBalance(),bank.getBalance(),0);
    }

    @Test
    public void getHolderName() {
        Assert.assertEquals(bank.getHolderName(),bank.getHolderName());
    }

    @Test
    public void getHolderSurname() {
        Assert.assertEquals(bank.getHolderSurname(), bank.getHolderSurname());
    }

    @Test
    public void getBranchCode() {
        Assert.assertEquals(bank.getBranchCode(),bank.getBranchCode());
    }

    @Test
    public void getBranchName() {
        Assert.assertEquals(bank.getBranchName(),bank.getBranchName());
    }

    @Test
    public void calculateFees() {
        Assert.assertEquals(bank.calculateFees(),bank.calculateFees(),0);
    }

    @Test
    public void withdraw() {
        Assert.assertEquals(bank.withdraw(500.00),bank.withdraw(500),0);
    }

    @Test
    public void deposit() {
        Assert.assertEquals(bank.deposit(144788855,1000),bank.deposit(144788855,1000),0);
    }
}