package UI.Steps;

import Utils.TestConstants;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestRunSteps extends BaseStep implements TestConstants {

    @Step("Test run creation with established data")
    public TestRunSteps testRunCreation(String testRunTitle) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.successfulCaseCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.successfulNewSuiteCreation();
        repositoryPage.openTestRunPage();
        listOfTestRunsPage.clickCreateTestRunButton();
        createNewTestRunPage.testRunCreation(testRunTitle)
                            .saveTestRun();
        return this;
    }

    @Step("Setting test run status with established data")
    public TestRunSteps setTestRunStatus(){
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
        return this;
    }

    @Step("Checking for a test run title to be {testRunTitle}")
    public void successfulTestRunCreationChecking(String testRunTitle){
        log.info("Checking for a test run title to be {}",testRunTitle);
        listOfTestRunsPage.testRunTitle.should(Condition.have(Condition.text(testRunTitle)));
    }

    @Step("Checking for a Create new Test run page title to be visible")
    public void invalidTestRunCreationChecking(){
        log.info("Checking for a Create new Test run page title to be visible");
        createNewTestRunPage.title.shouldBe(Condition.visible);
    }

    @Step("Checking for a test run result to be 'Passed'")
    public void setTestRunStatusChecking(){
        log.info("Checking for a test run result to be 'Passed'");
        testRunDetailsPage.testRunResult.should(Condition.have(Condition.text("Passed")));
    }
}
