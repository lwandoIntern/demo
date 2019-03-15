package za.ac.edu.org.pentec;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Bank {
    private String accName;
    private long accNum;
    private double balance;
    private String holderName;
    private String holderSurname;
    private int branchCode;
    private String branchName;
    public static final double BANK_FEE = 5.74;

    private Bank() {
    }

    public Bank(Builder builder) {
        this.accName = builder.accName;
        this.accNum = builder.accNum;
        this.balance = builder.balance;
        this.holderName = builder.holderName;
        this.holderSurname = builder.holderSurname;
        this.branchCode = builder.branchCode;
        this.branchName = builder.branchName;
    }

    public String getAccName() {
        return accName;
    }

    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public double calculateFees(){
        return balance = getBalance() - BANK_FEE;
    }

    public String withdraw(double amount){
        if(getBalance() >= amount)
            return ""+(balance = getBalance() - amount);
        else
            return "Insufficient funds";
    }

    public String deposit(long accNum,double amount){
        if (getAccNum() == accNum) {
            balance = getBalance() + amount;
            return "Deposit Successful balance: R" + getBalance();
        }else{
            return "Account Number Invalid...";
        }
    }

    public static class Builder{
        private String accName;
        private long accNum;
        private double balance;
        private String holderName;
        private String holderSurname;
        private int branchCode;
        private String branchName;


        public Builder accNum(long value){
            this.accNum = value;
            return this;
        }
        public Builder accName(String value){
            this.accName = value;
            return this;
        }
        public Builder balance(double value){
            this.balance = value;
            return this;
        }
        public Builder holderName(String value){
            this.holderName = value;
            return this;
        }
        public Builder holderSurname(String value){
            this.holderSurname = value;
            return this;
        }
        public Builder branchCode(int value){
            this.branchCode = value;
            return this;
        }
        public Builder branchName(String value){
            this.branchName = value;
            return this;
        }
        public Bank build(){
            return new Bank(this);
        }
    }
}
