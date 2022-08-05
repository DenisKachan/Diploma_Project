package UI.Steps;

import Utils.TestConstants;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class CaseSteps extends BaseStep implements TestConstants {

    @Step("Case creation with established data")
    public CaseSteps caseCreation(String title, String description, String preConditions, String postConditions,
                                       String status, String severity, String priority, String type,
                                       String layer, String flaky, String behavior, String automationStatus) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.caseCreation(title,description,preConditions,postConditions,
                status,severity,priority,type,
                layer,flaky,behavior,automationStatus)
                         .save();
        return this;
    }

    @Step("Checking for a test case title to be {testCaseTitle}")
    public void successfulCaseCreationChecking(String testCaseTitle){
        log.info("Checking for a test case title to be {}",testCaseTitle);
        repositoryPage.testCaseTitle.should(Condition.have(Condition.text(testCaseTitle)));
    }

    @Step("Checking for a Create new case page title to be visible")
    public void invalidCaseCreationChecking(){
        log.info("Checking for a Create new case page title to be visible");
        createNewCasePage.title.shouldBe(Condition.visible);
    }
}
