import java.math.BigDecimal;
import java.util.Scanner;

public class InputReader {

    public InputResult getUserInput() {
        Scanner scanner = new Scanner(System.in);
        InputResult result = new InputResult();

        System.out.println("Enter first number:");
        boolean isDouble = scanner.hasNextDouble();

        if(isDouble) {
            BigDecimal a = BigDecimal.valueOf(scanner.nextDouble());
            result.setA(a);
            scanner.nextLine();

            System.out.println("Enter operator:");
            String s = scanner.nextLine();

            if((s.equals("+")) || (s.equals("-")) || (s.equals("*")) || (s.equals("/")) || (s.equals("%"))) {
                char operator = s.charAt(0);
                result.setOperator(operator);

                System.out.println("Enter second number:");
                isDouble = scanner.hasNextDouble();

                if(isDouble) {
                    BigDecimal b = BigDecimal.valueOf(scanner.nextDouble());
                    result.setB(b);
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid operator");
            }
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();

        return result;
    }
}
