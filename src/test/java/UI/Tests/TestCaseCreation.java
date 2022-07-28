package UI.Tests;

import UI.Utils.TestConstants;
import org.testng.annotations.Test;

public class TestCaseCreation extends BaseTest implements TestConstants {
    @Test
    public void successfulTestCaseCreation() {
        caseSteps.caseCreation(TEST_CASE_TITLE,TEST_CASE_DESCRIPTION,
                TEST_CASE_PRE_CONDITIONS,TEST_CASE_POST_CONDITIONS,TEST_CASE_STATUS,
                TEST_CASE_SEVERITY, TEST_CASE_PRIORITY,TEST_CASE_TYPE,
                TEST_CASE_LAYER, TEST_CASE_FLAKY, TEST_CASE_BEHAVIOR, TEST_CASE_STATUS);
        caseSteps.successfulCaseCreationChecking(TEST_CASE_TITLE);
    }

    @Test
    public void invalidTestCreation() {
        caseSteps.caseCreation("",TEST_CASE_DESCRIPTION,
                TEST_CASE_PRE_CONDITIONS,TEST_CASE_POST_CONDITIONS,TEST_CASE_STATUS,
                TEST_CASE_SEVERITY, TEST_CASE_PRIORITY,TEST_CASE_TYPE,
                TEST_CASE_LAYER, TEST_CASE_FLAKY, TEST_CASE_BEHAVIOR, TEST_CASE_STATUS);
        caseSteps.invalidCaseCreationChecking();
    }
}
