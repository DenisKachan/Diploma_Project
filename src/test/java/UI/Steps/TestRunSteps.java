package UI.Steps;

import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class TestRunSteps extends BaseStep implements TestConstants {

    public void successfulTestRunCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.createNewCase();
        createNewCasePage.save();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.createNewSuite();
        createNewSuitePage.save();
        repositoryPage.openTestRunPage();
        listOfTestRunsPage.clickCreateTestRunButton();
        createNewTestRunPage.successfulTestRunCreation();
        listOfTestRunsPage.testRunTitle.should(Condition.have(Condition.text(TEST_RUN_TITLE)));
    }

    public void invalidTestRunCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.createNewCase();
        createNewCasePage.save();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.createNewSuite();
        createNewSuitePage.save();
        repositoryPage.openTestRunPage();
        listOfTestRunsPage.clickCreateTestRunButton();
        createNewTestRunPage.invalidTestRunCreation();
        createNewTestRunPage.title.shouldBe(Condition.visible);
    }

    public void setTestRunStatus(){
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.createNewCase();
        createNewCasePage.save();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.createNewSuite();
        createNewSuitePage.save();
        repositoryPage.openTestRunPage();
        listOfTestRunsPage.clickCreateTestRunButton();
        createNewTestRunPage.successfulTestRunCreation();
        listOfTestRunsPage.openTestRunDetailsPage();
        testRunDetailsPage.setTestRunResult();
        testRunDetailsPage.testRunResult.should(Condition.have(Condition.text("Passed")));
    }
}
