package UI.Tests;

import UI.Utils.TestConstants;
import org.testng.annotations.Test;

public class TestSuiteCreation extends BaseTest implements TestConstants {
    @Test
    public void successfulSuiteCreation() {
        suiteSteps.suiteCreation(TEST_SUITE_NAME,TEST_SUITE_DESCRIPTION,TEST_SUITE_PRECONDITIONS);
        suiteSteps.successfulSuiteCreationChecking(TEST_SUITE_NAME);
    }

    @Test
    public void invalidSuiteCreation() {
        suiteSteps.suiteCreation("",TEST_SUITE_DESCRIPTION,TEST_SUITE_PRECONDITIONS);
        suiteSteps.invalidSuiteCreationChecking();
    }
}
