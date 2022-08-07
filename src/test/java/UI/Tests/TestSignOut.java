package UI.Tests;

import Utils.RetryAnalyzer;
import org.testng.annotations.Test;

public class TestSignOut extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of sign out function")
    public void successfulSignOut() {
        loginSignOutSteps.successfulSignOut()
                .successfulSignOutChecking();
    }
}
