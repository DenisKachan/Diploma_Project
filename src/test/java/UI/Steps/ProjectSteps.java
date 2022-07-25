package UI.Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProjectSteps extends BaseStep {


    @Step("Create new project with invalid data")
    public void invalidNewProjectCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.incorrectProjectCreation();
        createNewProjectPage.pageTitle.shouldBe(Condition.visible);
    }

    @Step("Create new project with correct data")
    public void successfulProjectCreation() {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateButton();
        createNewProjectPage.successfulProjectCreation();
        repositoryPage.createCaseButton.shouldBe(Condition.visible);
    }
}
