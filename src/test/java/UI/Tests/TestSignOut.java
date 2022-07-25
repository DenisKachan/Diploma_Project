package UI.Tests;

import org.testng.annotations.Test;

public class TestSignOut extends BaseTest {
    @Test
    public void successfulSignOut() {
        loginSignOutSteps.successfulSignOut();
    }
}
