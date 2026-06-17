package utilities;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
    
    // These methods will provide data for test methods
    @DataProvider(name = "getUserTestData")
    public static Object[][] getUserTestData() {
        return new Object[][] {
            {"John", "Doe", 30, 8180818014L},
            {"Jane", "Smith", 25, 8180818015L},
            {"Mike", "Johnson", 35, 8180818016L}
        };
    }

    @DataProvider(name = "getCredentials")
    public static Object[][] getCredentials(){
        return new Object[][]{
            {"ompalande123@gmail.com","Test@123"},
            {"ompalande1234@gmail.com","Test@1234"}
        };

    }




}