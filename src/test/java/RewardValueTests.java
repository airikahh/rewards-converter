import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        int milesValue = 3571;
        double cashValue = 12.50;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(milesValue, rewardValue.convertCashToMiles(cashValue));

        milesValue = 161588;
        cashValue = 565.56;
        assertEquals(milesValue, rewardValue.convertCashToMiles(cashValue));

        milesValue = 285;
        cashValue = 1.00;
        assertEquals(milesValue, rewardValue.convertCashToMiles(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 8000;
        double cashValue = 28.0;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(cashValue, rewardValue.convertFromMilesToCash(milesValue));

        milesValue = 30000;
        cashValue = 105.00;
        assertEquals(cashValue, rewardValue.convertFromMilesToCash(milesValue));

        milesValue = 0;
        cashValue = 0.0;
        assertEquals(cashValue,rewardValue.convertFromMilesToCash(milesValue));
    }
}
