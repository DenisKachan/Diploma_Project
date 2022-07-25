package UI.Tests;

import org.testng.annotations.Test;

public class TestSuiteCreation extends BaseTest {
    @Test
    public void successfulSuiteCreation() {
        suiteSteps.successfulSuiteCreation();
    }

    @Test
    public void invalidSuiteCreation() {
        suiteSteps.invalidSuiteCreation();
    }
}
