public class Calculation {

    public static void perform(double a, char operator, double b) {
        switch (operator) {
            case '+':
                System.out.println("Result is: " + (a + b));
                break;

            case '-':
                System.out.println("Result is: " + (a - b));
                break;

            case '*':
                System.out.println("Result is: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result is: " + (a / b));
                } else {
                    System.out.println("ERROR: Cannot divide by zero!");
                }
                break;

            case '%':
                if (b != 0) {
                    System.out.println("Result is: " + (a % b));
                } else {
                    System.out.println("ERROR: Cannot divide by zero!");
                }
                break;
        }
    }
}
