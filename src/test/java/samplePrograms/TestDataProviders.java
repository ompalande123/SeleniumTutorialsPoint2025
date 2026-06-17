package samplePrograms;

import org.testng.annotations.Test;



public class TestDataProviders {
    
    @Test(dataProvider = "getUserTestData", dataProviderClass = utilities.MyDataProvider.class)
    public void readUserData(String firstName, String lastName, int age, long phoneNumber) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }


    @Test(dataProvider = "getCredentials", dataProviderClass = utilities.MyDataProvider.class)
    public void readCredentials(String email, String password) {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

}
