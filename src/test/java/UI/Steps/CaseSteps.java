package UI.Steps;

import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class CaseSteps extends BaseStep implements TestConstants {
    public void caseCreation(String title, String description, String preConditions, String postConditions,
                                       String status, String severity, String priority, String type,
                                       String layer, String flaky, String behavior, String automationStatus) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.caseCreation(title,description,preConditions,postConditions,
                status,severity,priority,type,
                layer,flaky,behavior,automationStatus);
        createNewCasePage.save();
    }

    public void successfulCaseCreationChecking(String testCaseTitle){
        repositoryPage.testCaseTitle.should(Condition.have(Condition.text(testCaseTitle)));
    }

    public void invalidCaseCreationChecking(){
        createNewCasePage.title.shouldBe(Condition.visible);
    }
}
