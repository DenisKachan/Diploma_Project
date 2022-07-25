package UI.Tests;

import org.testng.annotations.Test;

public class TestCaseCreation extends BaseTest {
    @Test
    public void successfulTestCaseCreation() {
        caseSteps.successfulCaseCreation();
    }

    @Test
    public void invalidTestCreation() {
        caseSteps.invalidCaseCreation();
    }
}
