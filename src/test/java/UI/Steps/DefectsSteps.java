package UI.Steps;

import UI.Utils.TestConstants;
import com.codeborne.selenide.Condition;

public class DefectsSteps extends BaseStep implements TestConstants {
    public void successfulDefectCreation(){
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.openDefectsPage();
        listOfDefectsPage.clickCreateNewDefectButton();
        createNewDefectPage.successfulDefectCreation();
        listOfDefectsPage.createdDefectTitle.should(Condition.have(Condition.text(DEFECT_TITLE)));
    }

    public void invalidDefectCreation(){
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.openDefectsPage();
        listOfDefectsPage.clickCreateNewDefectButton();
        createNewDefectPage.invalidDefectCreation();
        createNewDefectPage.pageTitle.shouldBe(Condition.visible);
    }
}
