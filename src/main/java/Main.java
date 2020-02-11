import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        InputReader reader = new InputReader();
        InputResult result = reader.getUserInput();

        Calculation calculation = new Calculation();
        BigDecimal calcResult = calculation.perform(result.getA(), result.getOperator(), result.getB());
        System.out.println(calcResult);
    }
}