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

    public void testRunCreation(String testRunTitle) {
        title.clear();
        title.sendKeys(testRunTitle);
        addCasesButton.click();
        selectTestCaseCheckBox.click();
        doneButton.click();
    }

    public ListOfTestRunsPage saveTestRun(){
        saveRunButton.click();
        return new ListOfTestRunsPage();
    }

    public void successfulTestRunCreation(){
        testRunCreation(TEST_RUN_TITLE);
        saveTestRun();
    }

}
