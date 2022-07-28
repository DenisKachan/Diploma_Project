package UI.Steps;

import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class DefectsSteps extends BaseStep implements TestConstants {
    public void defectCreation(String defectTitle, String defectResult){
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.openDefectsPage();
        listOfDefectsPage.clickCreateNewDefectButton();
        createNewDefectPage.defectCreation(defectTitle, defectResult);
    }

    public void successfulDefectCreationChecking(String defectTitle){
        listOfDefectsPage.createdDefectTitle.should(Condition.have(Condition.text(defectTitle)));
    }

    public void invalidDefectCreationChecking(){
        createNewDefectPage.pageTitle.shouldBe(Condition.visible);
    }
}
