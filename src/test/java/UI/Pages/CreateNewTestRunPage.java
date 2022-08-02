package UI.Pages;

import UI.Utils.TestConstants;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class CreateNewTestRunPage implements TestConstants {
    public SelenideElement title = $(By.id("title"));
    public SelenideElement addCasesButton = $(By.id("edit-run-add-cases-button"));
    public SelenideElement selectTestCaseCheckBox = $(By.className("custom-control-indicator"));
    public SelenideElement doneButton = $(By.id("select-cases-done-button"));
    public SelenideElement saveRunButton = $(By.id("save-run-button"));

    @Step("Creation of a new test run with {testRunTitle} as a title")
    public void testRunCreation(String testRunTitle) {
        log.info("Clear default test run title");
        title.clear();
        log.info("Set {} as a title",testRunTitle);
        title.sendKeys(testRunTitle);
        log.info("Click add cases button");
        addCasesButton.click();
        log.info("Select test case");
        selectTestCaseCheckBox.click();
        log.info("Click done button");
        doneButton.click();
    }

    @Step("Save test run and open List of test runs page")
    public ListOfTestRunsPage saveTestRun(){
        log.info("Save test run and open List of test runs page");
        saveRunButton.click();
        return new ListOfTestRunsPage();
    }

    @Step("Test ru creation with valid data")
    public void successfulTestRunCreation(){
        testRunCreation(TEST_RUN_TITLE);
        saveTestRun();
    }

}
