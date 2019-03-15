package good;

public class CalculateFees implements Balance{
    private final double monthly_fee = 5.95;

    public CalculateFees() {
    }

    public double getMonthly_fee() {
        return monthly_fee;
    }

    public double deductFee(double balance){
        return balance(balance) - monthly_fee;
    }

    @Override
    public double balance(double balance) {
        return balance;
    }
}
