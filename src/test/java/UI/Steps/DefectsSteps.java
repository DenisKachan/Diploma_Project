package UI.Steps;

import Utils.TestConstants;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DefectsSteps extends BaseStep implements TestConstants {

    @Step("Defect creation with established data")
    public void defectCreation(String defectTitle, String defectResult){
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.openDefectsPage();
        listOfDefectsPage.clickCreateNewDefectButton();
        createNewDefectPage.defectCreation(defectTitle, defectResult);
        createNewDefectPage.saveDefect();
    }

    @Step("Checking for a new defect title to be {defectTitle}")
    public void successfulDefectCreationChecking(String defectTitle){
        log.info("Checking for a new defect title to be {}",defectTitle);
        listOfDefectsPage.createdDefectTitle.should(Condition.have(Condition.text(defectTitle)));
    }

    @Step("Checking for Create new defect page title to be visible")
    public void invalidDefectCreationChecking(){
        log.info("Checking for Create new defect page title to be visible");
        createNewDefectPage.pageTitle.shouldBe(Condition.visible);
    }
}
