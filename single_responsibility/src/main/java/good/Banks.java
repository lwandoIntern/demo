package good;

import za.ac.edu.org.pentec.Bank;

public class Banks {
    private String accName;
    private long accNum;
    private String holderName;
    private String holderSurname;
    private int branchCode;
    private String branchName;

    public Banks(Builder builder) {
        this.accName = builder.accName;
        this.accNum = builder.accNum;
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

    public static class Builder{
        private String accName;
        private long accNum;
        private String holderName;
        private String holderSurname;
        private int branchCode;
        private String branchName;

        public Builder accName(String value){
            this.accName = value;
            return this;
        }

        public Builder accNum(long value){
            this.accNum = value;
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

        public Banks build(){
            return new Banks(this);
        }
    }
}
