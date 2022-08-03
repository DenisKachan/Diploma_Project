package UI.Pages;

import Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class CreateNewProjectPage implements TestConstants {
    public SelenideElement pageTitle = $x("//h1[text()='New Project']");
    public SelenideElement newProjectTitle = $(By.id("inputTitle"));
    public SelenideElement newProjectCode = $(By.id("inputCode"));
    public SelenideElement newProjectDescription = $(By.id("inputDescription"));
    public SelenideElement newProjectPrivateType = $(By.id("private-access-type"));
    public SelenideElement createProjectButton = $x("//button[text()='Create project']");

    @Step("Creation of a new private project with {projectTitle} as a title, {projectCode} as a code and {projectDescription} as a description")
    public void createNewProject(String projectTitle, String projectCode, String projectDescription) {
        log.info("Set {} as a title",projectTitle);
        newProjectTitle.sendKeys(projectTitle);
        log.info("Set {} as a code", projectCode);
        newProjectCode.sendKeys(projectCode);
        log.info("Set {} as a description",projectDescription);
        newProjectDescription.sendKeys(projectDescription);
        log.info("Choose private type of project");
        newProjectPrivateType.click();
    }

    @Step("Creation of a new project with valid data")
    public void successfulProjectCreation() {
        Faker faker = new Faker();
        createNewProject(faker.company().name(), faker.code().ean8(), PROJECT_DESCRIPTION);
        saveNewProject();
    }

    @Step("Save new project and open Repository page")
    public RepositoryPage saveNewProject(){
        log.info("Save new project and open Repository page");
        createProjectButton.click();
        return new RepositoryPage();
    }

}