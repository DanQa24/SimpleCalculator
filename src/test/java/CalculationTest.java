import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.math.BigDecimal;


public class CalculationTest {

    private Calculation calculation;

    @BeforeTest
    public void setCalculation() {
        calculation = new Calculation();
    }


    @Test(dataProvider = "addition", dataProviderClass = TestData.class, priority = 1)
    public void addValidNumbers(BigDecimal a, char operator, BigDecimal b, BigDecimal expected){

        BigDecimal actual = calculation.perform(a, operator, b);
        Assert.assertTrue(expected.compareTo(actual) == 0);
    }


    @Test(dataProvider = "subtraction", dataProviderClass = TestData.class, priority = 2)
    public void subtractValidNumbers(BigDecimal a, char operator, BigDecimal b, BigDecimal expected){

        BigDecimal actual = calculation.perform(a, operator, b);
        Assert.assertTrue(expected.compareTo(actual) == 0);
    }


    @Test(dataProvider = "multiplication", dataProviderClass = TestData.class, priority = 3)
    public void multiplyValidNumbers(BigDecimal a, char operator, BigDecimal b, BigDecimal expected){

        BigDecimal actual = calculation.perform(a, operator, b);
        Assert.assertTrue(expected.compareTo(actual) == 0);
    }


    @Test(dataProvider = "division", dataProviderClass = TestData.class, priority = 4)
    public void divideValidNumbers(BigDecimal a, char operator, BigDecimal b, BigDecimal expected){

        BigDecimal actual = calculation.perform(a, operator, b);
        Assert.assertTrue(expected.compareTo(actual) == 0);
    }


    @Test (dataProvider = "divide-by-zero", dataProviderClass = TestData.class,
            priority = 6, expectedExceptions = ArithmeticException.class)
    public void divideByZero(BigDecimal  a, char operator, BigDecimal b) {

        calculation.perform(a, operator, b);
    }
}
