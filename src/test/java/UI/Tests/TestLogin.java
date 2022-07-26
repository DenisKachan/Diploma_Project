package UI.Tests;

import Utils.PropertyReader;
import Utils.RetryAnalyzer;
import Utils.TestConstants;

import org.testng.annotations.Test;

public class TestLogin extends BaseTest implements TestConstants {

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of login function with valid data")
    public void successfulLoginTest() {
        PropertyReader propertyReader = new PropertyReader();
        loginSignOutSteps.login(propertyReader.getProperty("email"), propertyReader.getProperty("password"))
                            .successfulLoginChecking();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of login function with invalid data")
    public void loginWithInvalidDataTest() {
        loginSignOutSteps.login(faker.internet().emailAddress(),faker.code().ean8())
                            .invalidLoginChecking();
    }
}
