package UI.Tests;

import UI.Utils.PropertyReader;
import UI.Utils.TestConstants;

import org.testng.annotations.Test;

public class TestLogin extends BaseTest implements TestConstants {

    @Test(description = "Test for valid work of login function with valid data")
    public void successfulLoginTest() {
        PropertyReader propertyReader = new PropertyReader();
        loginSignOutSteps.login(propertyReader.getProperty("email"), propertyReader.getProperty("password"));
        loginSignOutSteps.successfulLoginChecking();
    }

    @Test(description = "Test for valid work of login function with invalid data")
    public void loginWithInvalidDataTest() {
        loginSignOutSteps.login(faker.internet().emailAddress(),faker.code().ean8());
        loginSignOutSteps.invalidLoginChecking();
    }
}
