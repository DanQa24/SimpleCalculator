import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "addition")
    public static Object[][] add(){
        return new Object[][] {
                {"2", '+', "6"},
                {"25.15", '+', "6.92"},
                {"-5", '+', "17.05"},
                {"-26", '+', "12"}
        };
    }

    @DataProvider(name = "subtraction")
    public static Object[][] subtract(){
        return new Object[][] {
                {"15", '-', "6"},
                {"8.73", '-', "6.22"},
                {"22", '-', "50"},
                {"-45", '-', "32"}
        };
    }

    @DataProvider(name = "multiplication")
    public static Object[][] multiply(){
        return new Object[][] {
                {"2", '*', "2"},
                {"25.15", '*', "6.92"},
                {"5", '*', "-2"},
                {"-5", '*', "3"},
                {"-3", '*', "-4"}
        };
    }

    @DataProvider(name = "division")
    public static Object[][] divide(){
        return new Object[][] {
                {"12", '/', "6"},
                {"15", '/', "-2"},
                {"-10", '/', "5"},
                {"-25", '/', "-5"},
                {"10", '/', "35"}
        };
    }

    @DataProvider(name = "divide-by-zero")
    public static Object[][] divideByZero(){
        return new Object[][] {
                {"5.5", '/', "0"},
                {"-8", '/', "0"},
                {"0", '/', "0"}
        };
    }
}
