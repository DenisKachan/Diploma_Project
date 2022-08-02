package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class CreateNewSuitePage implements TestConstants {
    public SelenideElement suiteName = $(By.id("name"));
    public SelenideElement suiteDescription = $(By.id("description"));
    public SelenideElement suitePreconditions = $(By.id("preconditions"));
    public SelenideElement createSuiteButton = $(By.id("save-suite-button"));
    public SelenideElement createSuiteTitle = $x("//h2[text()='Create suite']");

    @Step("Suite creation with {name} as a name, {description} as a description and {preconditions} as preconditions")
    public void newSuiteCreation(String name, String description, String preconditions){
        log.info("Set {} as a name",name);
        suiteName.sendKeys(name);
        log.info("Set {} as a description", description);
        suiteDescription.sendKeys(description);
        log.info("Set {} as preconditions", preconditions);
        suitePreconditions.sendKeys(preconditions);
    }

    @Step("Suite creation with valid data")
    public void successfulNewSuiteCreation() {
        suiteName.sendKeys(TEST_SUITE_NAME);
        suiteDescription.sendKeys(TEST_SUITE_DESCRIPTION);
        suitePreconditions.sendKeys(TEST_SUITE_PRECONDITIONS);
        save();
    }

    @Step("Save new suite and open Repository page")
    public RepositoryPage save() {
        log.info("Save new suite and open Repository page");
        createSuiteButton.click();
        return new RepositoryPage();
    }

}
