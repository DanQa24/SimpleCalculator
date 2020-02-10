import java.math.BigDecimal;
import java.math.RoundingMode;


public class Calculation {

    public BigDecimal calculationResult;

    public void perform(String a, char operator, String b) {
        BigDecimal valueA = BigDecimal.valueOf(Double.parseDouble(a));
        BigDecimal valueB = BigDecimal.valueOf(Double.parseDouble(b));
        switch (operator) {

            case '+':
                calculationResult = valueA.add(valueB);
                break;

            case '-':
                calculationResult = valueA.subtract(valueB);
                break;

            case '*':
                calculationResult = valueA.multiply(valueB);
                break;
            case '/':
                calculationResult = valueA.divide(valueB, 4, RoundingMode.HALF_UP);

                if (Double.isInfinite(calculationResult.doubleValue()) && (valueA.signum() < 0)) {
                    calculationResult = BigDecimal.valueOf(Double.NEGATIVE_INFINITY);
                }
                if (Double.isInfinite(calculationResult.doubleValue()) && (valueA.signum() > 0)) {
                    calculationResult = BigDecimal.valueOf(Double.POSITIVE_INFINITY);
                }
                if ((Double.isNaN(calculationResult.doubleValue())) && (valueA.signum() == 0)) {
                    calculationResult = BigDecimal.valueOf(Double.NaN);
                }
                break;
        }
    }
}
