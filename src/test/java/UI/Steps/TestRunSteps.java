package UI.Steps;

import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class TestRunSteps extends BaseStep implements TestConstants {

    public void testRunCreation(String testRunTitle) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.successfulCaseCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.successfulNewSuiteCreation();
        repositoryPage.openTestRunPage();
        listOfTestRunsPage.clickCreateTestRunButton();
        createNewTestRunPage.testRunCreation(testRunTitle);
        createNewTestRunPage.saveTestRun();
    }

    public void setTestRunStatus(){
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.successfulCaseCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.successfulNewSuiteCreation();
        repositoryPage.openTestRunPage();
        listOfTestRunsPage.clickCreateTestRunButton();
        createNewTestRunPage.successfulTestRunCreation();
        listOfTestRunsPage.openTestRunDetailsPage();
        testRunDetailsPage.setTestRunResult();
    }

    public void successfulTestRunCreationChecking(String testRunTitle){
        listOfTestRunsPage.testRunTitle.should(Condition.have(Condition.text(testRunTitle)));
    }

    public void invalidTestRunCreationChecking(){
        createNewTestRunPage.title.shouldBe(Condition.visible);
    }

    public void setTestRunStatusChecking(){
        testRunDetailsPage.testRunResult.should(Condition.have(Condition.text("Passed")));
    }
}
