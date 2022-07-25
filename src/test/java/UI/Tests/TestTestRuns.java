package UI.Tests;

import org.testng.annotations.Test;

public class TestTestRuns extends BaseTest {
    @Test
    public void successfulTestRunCreation() {
        testRunSteps.successfulTestRunCreation();
    }

    @Test
    public void invalidTestRunCreation() {
        testRunSteps.invalidTestRunCreation();
    }

    @Test
    public void setTestRunStatus(){
        testRunSteps.setTestRunStatus();
    }
}
