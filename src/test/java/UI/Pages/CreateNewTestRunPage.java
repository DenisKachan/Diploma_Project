package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewTestRunPage implements TestConstants {
    public SelenideElement title = $(By.id("title"));
    public SelenideElement addCasesButton = $(By.id("edit-run-add-cases-button"));
    public SelenideElement selectTestCaseCheckBox = $(By.className("custom-control-indicator"));
    public SelenideElement doneButton = $(By.id("select-cases-done-button"));
    public SelenideElement saveRunButton = $(By.id("save-run-button"));

    public ListOfTestRunsPage successfulTestRunCreation() {
        title.clear();
        title.sendKeys(TEST_RUN_TITLE);
        addCasesButton.click();
        selectTestCaseCheckBox.click();
        doneButton.click();
        saveRunButton.click();
        return new ListOfTestRunsPage();
    }

    public void invalidTestRunCreation() {
        title.clear();
        title.sendKeys("");
        addCasesButton.click();
        selectTestCaseCheckBox.click();
        doneButton.click();
        saveRunButton.click();
    }

}
