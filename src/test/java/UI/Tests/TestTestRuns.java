package UI.Tests;

import UI.Utils.TestConstants;
import org.testng.annotations.Test;

public class TestTestRuns extends BaseTest implements TestConstants{
    @Test
    public void successfulTestRunCreation() {
        testRunSteps.testRunCreation(TEST_RUN_TITLE);
        testRunSteps.successfulTestRunCreationChecking(TEST_RUN_TITLE);
    }

    @Test
    public void invalidTestRunCreation() {
        testRunSteps.testRunCreation("");
        testRunSteps.invalidTestRunCreationChecking();
    }

    @Test
    public void setTestRunStatus(){
        testRunSteps.setTestRunStatus();
        testRunSteps.setTestRunStatusChecking();
    }
}
