import org.testng.annotations.DataProvider;

import java.math.BigDecimal;


public class TestData {

    @DataProvider(name = "addition")
    public static Object[][] add(){
        return new Object[][] {
                {new BigDecimal("2"), '+', new BigDecimal("6"), new BigDecimal("8")},
                {new BigDecimal("25.15"), '+', new BigDecimal("6.92"), new BigDecimal("32.07")},
                {new BigDecimal("-5"), '+', new BigDecimal("17.05"), new BigDecimal("12.05")},
                {new BigDecimal("-26"), '+', new BigDecimal("12"), new BigDecimal("-14")}
        };
    }

    @DataProvider(name = "subtraction")
    public static Object[][] subtract(){
        return new Object[][] {
                {new BigDecimal("15"), '-', new BigDecimal("6"), new BigDecimal("9")},
                {new BigDecimal("8.73"), '-', new BigDecimal("6.22"), new BigDecimal("2.51")},
                {new BigDecimal("22"), '-', new BigDecimal("50"), new BigDecimal("-28")},
                {new BigDecimal("-45"), '-', new BigDecimal("32"), new BigDecimal("-77")}
        };
    }

    @DataProvider(name = "multiplication")
    public static Object[][] multiply(){
        return new Object[][] {
                {new BigDecimal("2"), '*', new BigDecimal("2"), new BigDecimal("4")},
                {new BigDecimal("25.15"), '*', new BigDecimal("6.92"), new BigDecimal("174.038")},
                {new BigDecimal("5"), '*', new BigDecimal("-2"), new BigDecimal("-10")},
                {new BigDecimal("-5"), '*', new BigDecimal("3"), new BigDecimal("-15")},
                {new BigDecimal("-3"), '*', new BigDecimal("-4"), new BigDecimal("12")}
        };
    }

    @DataProvider(name = "division")
    public static Object[][] divide(){
        return new Object[][] {
                {new BigDecimal("12"), '/', new BigDecimal("6"), new BigDecimal("2")},
                {new BigDecimal("15"), '/', new BigDecimal("-2"), new BigDecimal("-7.5")},
                {new BigDecimal("-10"), '/', new BigDecimal("5"), new BigDecimal("-2")},
                {new BigDecimal("-25"), '/', new BigDecimal("-5"), new BigDecimal("5")},
                {new BigDecimal("10"), '/', new BigDecimal("35"), new BigDecimal("0.2857")}
        };
    }

    @DataProvider(name = "divide-by-zero")
    public static Object[][] divideByZero(){
        return new Object[][] {
                {new BigDecimal("5.5"), '/', new BigDecimal("0")},
                {new BigDecimal("-8"), '/', new BigDecimal("0")},
                {new BigDecimal("0"), '/', new BigDecimal("0")}
        };
    }
}
