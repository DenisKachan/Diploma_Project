package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class CreateNewProjectPage implements TestConstants {
    public SelenideElement pageTitle = $x("//h1[text()='New Project']");
    public SelenideElement newProjectTitle = $(By.id("inputTitle"));
    public SelenideElement newProjectCode = $(By.id("inputCode"));
    public SelenideElement newProjectDescription = $(By.id("inputDescription"));
    public SelenideElement newProjectPrivateType = $(By.id("private-access-type"));
    public SelenideElement createProjectButton = $x("//button[text()='Create project']");

    public void createNewProject(String projectTitle, String projectCode, String projectDescription) {
        newProjectTitle.sendKeys(projectTitle);
        newProjectCode.sendKeys(projectCode);
        newProjectDescription.sendKeys(projectDescription);
        newProjectPrivateType.click();
        createProjectButton.click();
    }

    public CreateNewProjectPage incorrectProjectCreation() {
        createNewProject("", PROJECT_INVALID_CODE, PROJECT_DESCRIPTION);
        return this;
    }

    public RepositoryPage successfulProjectCreation() {
        Faker faker = new Faker();
        createNewProject(faker.company().name(), faker.code().ean8(), PROJECT_DESCRIPTION);
        return new RepositoryPage();
    }

}