package UI.Tests;

import UI.Utils.TestConstants;
import org.testng.annotations.Test;

public class TestProjectCreation extends BaseTest implements TestConstants {
    @Test(description = "Test for valid work of project creation with invalid data")
    public void createProjectWithInvalidData() {
        projectSteps.projectCreation("",faker.code().ean8(), PROJECT_DESCRIPTION);
        projectSteps.invalidProjectCreationChecking();
    }

    @Test(description = "Test for valid work of project creation with valid data")
    public void successfulProjectCreation() {
        projectSteps.projectCreation(faker.company().name(), faker.code().ean8(),PROJECT_DESCRIPTION);
        projectSteps.successfulProjectCreationChecking();
    }
}
