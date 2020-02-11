import java.math.BigDecimal;
import java.math.RoundingMode;


public class Calculation {

    public BigDecimal perform(BigDecimal a, char operator, BigDecimal b) {

        BigDecimal calculationResult = null;

        switch (operator) {
            case '+':
                calculationResult = a.add(b);
                break;
            case '-':
                calculationResult = a.subtract(b);
                break;
            case '*':
                calculationResult = a.multiply(b);
                break;
            case '/':
                calculationResult = a.divide(b, 4, RoundingMode.HALF_UP);
                break;
        }
        return calculationResult;
    }
}
