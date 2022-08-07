package UI.Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProjectSteps extends BaseStep {

    @Step("Project creation with established data")
    public ProjectSteps projectCreation(String title, String code, String description) {
        loginPage.successfulLogin();
        listOfProjectsPage.clickCreateProjectButton();
        createNewProjectPage.createNewProject(title, code, description)
                            .saveNewProject();
        return this;
    }

    @Step("Checking for a Create new project page title to be visible")
    public void invalidProjectCreationChecking(){
        log.info("Checking for a Create new project page title to be visible");
        createNewProjectPage.pageTitle.shouldBe(Condition.visible);
    }

    @Step("Checking for a Create case button to be visible")
    public void successfulProjectCreationChecking(){
        log.info("Checking for a Create case button to be visible");
        repositoryPage.createCaseButton.shouldBe(Condition.visible);
    }
}
