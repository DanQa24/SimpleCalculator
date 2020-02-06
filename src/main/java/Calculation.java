
public class Calculation {

    public double calculationResult;

    public void perform(double a, char operator, double b) {
        switch (operator) {
            case '+':
                calculationResult = (a + b);
                break;
            case '-':
                calculationResult = (a - b);

                break;
            case '*':
                calculationResult = (a * b);

                break;
            case '/':
                calculationResult = (a / b);
                if ((Double.isInfinite(calculationResult)) && (a < 0)) {
                    calculationResult = Double.NEGATIVE_INFINITY;
                }
                if ((Double.isInfinite(calculationResult)) && (a > 0)) {
                    calculationResult = Double.POSITIVE_INFINITY;
                }
                if ((Double.isNaN(calculationResult)) && (a == 0)) {
                    calculationResult = Double.NaN;
                }

                break;
            case '%':
                calculationResult = (a % b);
                // One of the operations generating NaN: Remainder x % y (when x is an infinity OR y is zero).
                if (Double.isNaN(calculationResult)) {
                    calculationResult = Double.NaN;
                }
                break;
        }
    }
}
