package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ListOfProjectsPage {
    public SelenideElement createProjectButton = $(By.id("createButton"));
    public SelenideElement accountImage = $(By.className("Eb2vGG"));
    public SelenideElement signOutButton = $x("//span[text()='Sign out']");

    public CreateNewProjectPage clickCreateProjectButton() {
        createProjectButton.click();
        return new CreateNewProjectPage();
    }

    public LoginPage signOut() {
        accountImage.click();
        signOutButton.click();
        return new LoginPage();
    }
}
