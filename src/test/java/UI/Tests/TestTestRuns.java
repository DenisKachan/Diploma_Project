package UI.Tests;

import Utils.TestConstants;
import org.testng.annotations.Test;

public class TestTestRuns extends BaseTest implements TestConstants{

    @Test(description = "Test for valid work of test run creation with valid data")
    public void successfulTestRunCreation() {
        testRunSteps.testRunCreation(TEST_RUN_TITLE)
                    .successfulTestRunCreationChecking(TEST_RUN_TITLE);
    }

    @Test(description = "Test for valid work of test run creation with invalid data")
    public void invalidTestRunCreation() {
        testRunSteps.testRunCreation("")
                    .invalidTestRunCreationChecking();
    }

    @Test(description = "Test for valid work of setting test run status")
    public void setTestRunStatus(){
        testRunSteps.setTestRunStatus()
                    .setTestRunStatusChecking();
    }
}
