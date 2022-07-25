package UI.Steps;


import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class SuiteSteps extends BaseStep implements TestConstants {
    public void successfulSuiteCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.createNewSuite();
        createNewSuitePage.save();
        repositoryPage.testSuiteTitle.should(Condition.have(Condition.text(TEST_SUITE_NAME)));
    }

    public void invalidSuiteCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.invalidSuiteCreation();
        createNewSuitePage.save();
        createNewSuitePage.createSuiteTitle.shouldBe(Condition.visible);
    }
}
