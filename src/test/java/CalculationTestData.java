import org.testng.annotations.DataProvider;

public class CalculationTestData {

    @DataProvider(name = "addition")
    public static Object[][] add(){
        return new Object[][] {
                {2, '+', 6, 8},
                {25.15, '+', 6.92, 32.07},
                {-5, '+', 17.05, 12.05},
                {-26, '+', 12, -14}
        };
    }

    @DataProvider(name = "subtraction")
    public static Object[][] subtract(){
        return new Object[][] {
                {15, '-', 6, 9},
                {8.73, '-', 6.22, 2.51},
                {22, '-', 50, -28},
                {-45, '-', 32, -77}
        };
    }

    @DataProvider(name = "multiplication")
    public static Object[][] multiply(){
        return new Object[][] {
                {2, '*', 2, 4},
                {25.15, '*', 6.92, 174.04},
                {5, '*', -2, -10},
                {-5, '*', 3, -15},
                {-3, '*', -4, 12}
        };
    }

    @DataProvider(name = "division")
    public static Object[][] divide(){
        return new Object[][] {
                {12, '/', 6, 2},
                {15, '/', -2, -7.5},
                {-10, '/', 5, -2},
                {-25, '/', -5, 5},
                {10, '/', 35, 0.29},
        };
    }

    @DataProvider(name = "remainder")
    public static Object[][] remainder(){
        return new Object[][] {
                {20, '%', 6, 2},
                {25, '%', 7, 4},
                {8, '%', 2, 0},
        };
    }

    @DataProvider(name = "divide-by-zero")
    public static Object[][] divideByZero(){
        return new Object[][] {
                {5.5, '/', 0, Double.POSITIVE_INFINITY},
                {-8, '/', 0, Double.NEGATIVE_INFINITY},
                {0, '/', 0, Double.NaN},
                {7.5, '%', 0, Double.NaN},
                {-12, '%', 0, Double.NaN}
        };
    }

}
