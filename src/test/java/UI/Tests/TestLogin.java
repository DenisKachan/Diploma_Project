package UI.Tests;

import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @Test
    public void successfulLoginTest() {
        loginSignOutSteps.successfulLogin();
    }

    @Test
    public void loginWithInvalidDataTest() {
        loginSignOutSteps.loginWithInvalidData();
    }
}
