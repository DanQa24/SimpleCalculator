import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest {

    // Tests with valid values

    @Test(dataProvider = "addition", dataProviderClass = TestData.class, priority = 1)
    public void addValidNumbers(double a, char operator, double b, double expectedResult){
        Calculation calculation = new Calculation();
        calculation.perform(a, operator, b);

        Assert.assertEquals(calculation.calculationResult, expectedResult);
    }

    @Test(dataProvider = "subtraction", dataProviderClass = TestData.class, priority = 2)
    public void subtractValidNumbers(double a, char operator, double b, double expectedResult){
        Calculation calculation = new Calculation();
        calculation.perform(a, operator, b);

        Assert.assertEquals(calculation.calculationResult, expectedResult);
    }

    @Test(dataProvider = "multiplication", dataProviderClass = TestData.class, priority = 3)
    public void multiplyValidNumbers(double a, char operator, double b, double expectedResult){
        Calculation calculation = new Calculation();
        calculation.perform(a, operator, b);

        Assert.assertEquals(calculation.calculationResult, expectedResult);
    }

    @Test(dataProvider = "division", dataProviderClass = TestData.class, priority = 4)
    public void divideValidNumbers(double a, char operator, double b, double expectedResult){
        Calculation calculation = new Calculation();
        calculation.perform(a, operator, b);

        Assert.assertEquals(calculation.calculationResult, expectedResult);
    }

    @Test(dataProvider = "remainder", dataProviderClass = TestData.class, priority = 5)
    public void divisionRemainderOfValidNumbers(double a, char operator, double b, double expectedResult){
        Calculation calculation = new Calculation();
        calculation.perform(a, operator, b);

        Assert.assertEquals(calculation.calculationResult, expectedResult);
    }


    // Tests with invalid values

    @Test (dataProvider = "divide-by-zero", dataProviderClass = TestData.class, priority = 6)
    public void divideByZero(double a, char operator, double b, Double expectedResult) {
        Calculation calculation = new Calculation();
        calculation.perform(a, operator, b);

        Assert.assertEquals(calculation.calculationResult, expectedResult);
    }
}
