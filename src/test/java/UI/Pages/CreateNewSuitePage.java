package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CreateNewSuitePage implements TestConstants {
    public SelenideElement suiteName = $(By.id("name"));
    public SelenideElement suiteDescription = $(By.id("description"));
    public SelenideElement suitePreconditions = $(By.id("preconditions"));
    public SelenideElement createSuiteButton = $(By.id("save-suite-button"));
    public SelenideElement createSuiteTitle = $x("//h2[text()='Create suite']");

    public void newSuiteCreation(String name, String description, String preconditions){
        suiteName.sendKeys(name);
        suiteDescription.sendKeys(description);
        suitePreconditions.sendKeys(preconditions);
    }

    public void successfulNewSuiteCreation() {
        suiteName.sendKeys(TEST_SUITE_NAME);
        suiteDescription.sendKeys(TEST_SUITE_DESCRIPTION);
        suitePreconditions.sendKeys(TEST_SUITE_PRECONDITIONS);
        save();
    }

    public RepositoryPage save() {
        createSuiteButton.click();
        return new RepositoryPage();
    }

}
