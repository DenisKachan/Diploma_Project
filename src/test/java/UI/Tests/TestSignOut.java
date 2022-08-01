package UI.Tests;

import org.testng.annotations.Test;

public class TestSignOut extends BaseTest {
    @Test(description = "Test for valid work of sign out function")
    public void successfulSignOut() {
        loginSignOutSteps.successfulSignOut();
        loginSignOutSteps.successfulSignOutChecking();
    }
}
