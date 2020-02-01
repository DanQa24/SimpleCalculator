import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        boolean isDouble = scanner.hasNextDouble();

        if(isDouble) {
            double a = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter operator:");
            String s = scanner.nextLine();

            if((s.equals("+")) || (s.equals("-")) || (s.equals("*")) || (s.equals("/")) || (s.equals("%"))) {
                char operator = s.charAt(0);

                System.out.println("Enter second number:");
                isDouble = scanner.hasNextDouble();

                if(isDouble) {
                    double b = scanner.nextDouble();
                    Calculation.perform(a, operator, b);
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
    }
}