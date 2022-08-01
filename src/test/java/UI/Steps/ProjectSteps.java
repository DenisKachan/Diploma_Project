package UI.Steps;

import com.codeborne.selenide.Condition;

public class ProjectSteps extends BaseStep {

    public void projectCreation(String title, String code, String description) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.createNewProject(title, code, description);
    }

    public void invalidProjectCreationChecking(){
        createNewProjectPage.pageTitle.shouldBe(Condition.visible);
    }

    public void successfulProjectCreationChecking(){
        repositoryPage.createCaseButton.shouldBe(Condition.visible);
    }
}
