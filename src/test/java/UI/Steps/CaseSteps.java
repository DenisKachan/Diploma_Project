package UI.Steps;

import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class CaseSteps extends BaseStep implements TestConstants {
    public void successfulCaseCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.createNewCase();
        createNewCasePage.save();
        repositoryPage.testCaseTitle.should(Condition.have(Condition.text(TEST_CASE_TITLE)));
    }

    public void invalidCaseCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateCaseButton();
        createNewCasePage.invalidCaseCreation();
        createNewCasePage.save();
        createNewCasePage.title.shouldBe(Condition.visible);
    }
}
