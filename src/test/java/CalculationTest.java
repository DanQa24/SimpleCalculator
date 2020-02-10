import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class CalculationTest {

    // Tests with valid values

    @Test(dataProvider = "addition", dataProviderClass = TestData.class, priority = 1)
    public void addValidNumbers(String a, char operator, String b){
        Calculation calculation = new Calculation();
        BigDecimal expected = BigDecimal.valueOf(Double.parseDouble(a)).add(BigDecimal.valueOf(Double.parseDouble(b)));

        calculation.perform(a, operator, b);

        System.out.println("Expected Big Decimal is: " + expected);
        System.out.println("Calculation result is: " + calculation.calculationResult);
        Assert.assertTrue(expected.compareTo(calculation.calculationResult) == 0);

    }


    @Test(dataProvider = "subtraction", dataProviderClass = TestData.class, priority = 2)
    public void subtractValidNumbers(String a, char operator, String b){
        Calculation calculation = new Calculation();
        BigDecimal expected = BigDecimal.valueOf(Double.parseDouble(a)).subtract(BigDecimal.valueOf(Double.parseDouble(b)));

        calculation.perform(a, operator, b);

        System.out.println("Expected Big Decimal is: " + expected);
        System.out.println("Calculation result is: " + calculation.calculationResult);
        Assert.assertTrue(expected.compareTo(calculation.calculationResult) == 0);


    }

    @Test(dataProvider = "multiplication", dataProviderClass = TestData.class, priority = 3)
    public void multiplyValidNumbers(String a, char operator, String b){
        Calculation calculation = new Calculation();
        BigDecimal expected = BigDecimal.valueOf(Double.parseDouble(a)).multiply(BigDecimal.valueOf(Double.parseDouble(b)));

        calculation.perform(a, operator, b);

        System.out.println("Expected Big Decimal is: " + expected);
        System.out.println("Calculation result is: " + calculation.calculationResult);
        Assert.assertTrue(expected.compareTo(calculation.calculationResult) == 0);


    }

    @Test(dataProvider = "division", dataProviderClass = TestData.class, priority = 4)
    public void divideValidNumbers(String a, char operator, String b){
        Calculation calculation = new Calculation();
        BigDecimal expected = BigDecimal.valueOf(Double.parseDouble(a))
                .divide(BigDecimal.valueOf(Double.parseDouble(b)), 4, RoundingMode.HALF_UP);

        calculation.perform(a, operator, b);

        System.out.println("Expected Big Decimal is: " + expected);
        System.out.println("Calculation result is: " + calculation.calculationResult);
        Assert.assertTrue(expected.compareTo(calculation.calculationResult) == 0);


    }


    // Tests with invalid values

    @Test (dataProvider = "divide-by-zero", dataProviderClass = TestData.class,
            priority = 6, expectedExceptions = ArithmeticException.class)
    public void divideByZero(String  a, char operator, String b) {
        Calculation calculation = new Calculation();
        try {
            calculation.perform(a, operator, b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();

        }
    }

}
