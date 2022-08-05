package UI.Steps;


import Utils.TestConstants;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SuiteSteps extends BaseStep implements TestConstants {

    @Step("Suite creation with established data")
    public SuiteSteps suiteCreation(String suiteName, String suiteDescription, String suitePreconditions) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.clickCreateSuiteButton();
        createNewSuitePage.newSuiteCreation(suiteName,suiteDescription,suitePreconditions)
                            .save();
        return this;
    }

    @Step("Checking for a new suite title to be {suiteName}")
    public void successfulSuiteCreationChecking(String suiteName){
        log.info("Checking for a new suite title to be {}",suiteName);
        repositoryPage.testSuiteTitle.should(Condition.have(Condition.text(suiteName)));
    }

    @Step("Checking for a Create new suite page title to be visible")
    public void invalidSuiteCreationChecking(){
        log.info("Checking for a Create new suite page title to be visible");
        createNewSuitePage.createSuiteTitle.shouldBe(Condition.visible);
    }
}
