import java.math.BigDecimal;

public class RewardValue {

    private double cashValue;
    private int milesValue;
    private double rate = 0.0035;


    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }


    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double convertFromMilesToCash(int milesValue){

        return milesValue * rate;
    }

    public int convertCashToMiles(double cashValue){

        return (int) (cashValue / rate);
    }


}
