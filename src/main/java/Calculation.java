public class Calculation {

    public double calculationResult;

    public void perform(double a, char operator, double b) {
        String result;
        switch (operator) {
            case '+':
                result = String.format("%.2f", (a + b));
                calculationResult = Double.parseDouble(result);
                break;
            case '-':
                result = String.format("%.2f", (a - b));
                calculationResult = Double.parseDouble(result);
                break;
            case '*':
                result = String.format("%.2f", (a * b));
                calculationResult = Double.parseDouble(result);
                break;
            case '/':
                if (b != 0) {
                    result = String.format("%.2f", (a / b));
                    calculationResult = Double.parseDouble(result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    result = String.format("%.2f", (a % b));
                    calculationResult = Double.parseDouble(result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
        }
    }

    public void printResult() {
        System.out.println("Result is: " + calculationResult);
    }
}
