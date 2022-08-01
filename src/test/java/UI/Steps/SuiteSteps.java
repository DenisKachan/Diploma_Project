package UI.Steps;


import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class SuiteSteps extends BaseStep implements TestConstants {
    public void suiteCreation(String suiteName, String suiteDescription, String suitePreconditions) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.newSuiteCreation(suiteName,suiteDescription,suitePreconditions);
        createNewSuitePage.save();
    }

    public void successfulSuiteCreationChecking(String suiteName){
        repositoryPage.testSuiteTitle.should(Condition.have(Condition.text(suiteName)));
    }

    public void invalidSuiteCreationChecking(){
        createNewSuitePage.createSuiteTitle.shouldBe(Condition.visible);
    }
}
