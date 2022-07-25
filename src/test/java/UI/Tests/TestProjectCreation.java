package UI.Tests;

import org.testng.annotations.Test;

public class TestProjectCreation extends BaseTest {
    @Test
    public void createProjectWithInvalidData() {
        projectSteps.invalidNewProjectCreation();
    }

    @Test
    public void successfulProjectCreation() {
        projectSteps.successfulProjectCreation();
    }
}
