package UI.Tests;

import Utils.RetryAnalyzer;
import Utils.TestConstants;
import org.testng.annotations.Test;

public class TestSuiteCreation extends BaseTest implements TestConstants {

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of test suite creation with valid data")
    public void successfulSuiteCreation() {
        suiteSteps.suiteCreation(TEST_SUITE_NAME,TEST_SUITE_DESCRIPTION,TEST_SUITE_PRECONDITIONS)
                    .successfulSuiteCreationChecking(TEST_SUITE_NAME);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test for valid work of test suite creation with invalid data")
    public void invalidSuiteCreation() {
        suiteSteps.suiteCreation("",TEST_SUITE_DESCRIPTION,TEST_SUITE_PRECONDITIONS)
                    .invalidSuiteCreationChecking();
    }
}
