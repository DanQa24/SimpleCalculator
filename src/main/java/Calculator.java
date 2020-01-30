import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter operator:");
        String s = scanner.nextLine();
        char operator = s.charAt(0);

        System.out.println("Enter second number:");
        double b = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                    System.out.println(a - b);
                    break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                 if (b != 0) {
                    System.out.println(a / b);
                 } else {
                     System.out.println("ERROR: Cannot divide by zero!");
                 }
                 break;

            case '%':
                 if (b != 0) {
                     System.out.println(a % b);
                 } else {
                    System.out.println("ERROR: Cannot divide by zero!");
                 }
                 break;
        }
    }
}