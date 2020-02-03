public class Calculation {

    private double calculationResult;

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
                if (b != 0) {
                    calculationResult = (a / b);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    calculationResult = (a % b);
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
