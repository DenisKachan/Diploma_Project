package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class ListOfProjectsPage {

    public SelenideElement createProjectButton = $(By.id("createButton"));
    public SelenideElement accountImage = $(By.className("Eb2vGG"));
    public SelenideElement signOutButton = $x("//span[text()='Sign out']");

    @Step("Click create project button and open Create new project page")
    public CreateNewProjectPage clickCreateProjectButton() {
        log.info("Click create project button and open Create new project page");
        createProjectButton.click();
        return new CreateNewProjectPage();
    }

    @Step("Click account image and sign out button to sign out")
    public LoginPage signOut() {
        log.info("Click account image");
        accountImage.click();
        log.info("Click sign out button and open Login page");
        signOutButton.click();
        return new LoginPage();
    }
}
