import java.util.Scanner;

public class InputReader {

    public double a;
    public double b;
    public char operator;

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        boolean isDouble = scanner.hasNextDouble();

        if(isDouble) {
            double a = scanner.nextDouble();
            this.a = a;
            scanner.nextLine();

            System.out.println("Enter operator:");
            String s = scanner.nextLine();

            if((s.equals("+")) || (s.equals("-")) || (s.equals("*")) || (s.equals("/")) || (s.equals("%"))) {
                char operator = s.charAt(0);
                this.operator = operator;

                System.out.println("Enter second number:");
                isDouble = scanner.hasNextDouble();

                if(isDouble) {
                    double b = scanner.nextDouble();
                    this.b = b;
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
