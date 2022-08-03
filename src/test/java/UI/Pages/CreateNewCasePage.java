package UI.Pages;

import Utils.TestConstants;
import UI.Wrappers.DropdownTestCase;
import UI.Wrappers.InputTestCase;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class CreateNewCasePage implements TestConstants {
    public SelenideElement title = $x("//h1[text()='Create test case']");
    public SelenideElement saveButton = $(By.id("save-case"));

    @Step("Click save button and open Repository page")
    public RepositoryPage save() {
        log.info("Click save button and open Repository page");
        saveButton.click();
        return new RepositoryPage();
    }
    @Step("Creation of a new test case")
    public void caseCreation(String title, String description, String preConditions, String postConditions,
                             String status, String severity, String priority, String type,
                             String layer, String flaky, String behavior, String automationStatus) {
        log.info("Set {} as a title",title);
        new InputTestCase("Title").write(title);
        log.info("Set {} as a description", description);
        new InputTestCase("Description").write(description);
        log.info("Set {} as preconditions", preConditions);
        new InputTestCase("Pre-conditions").write(preConditions);
        log.info("Set {} as post conditions",postConditions);
        new InputTestCase("Post-conditions").write(postConditions);
        log.info("Set {} as a status", status);
        new DropdownTestCase("Status").select(status);
        log.info("Set {} as a severity",severity);
        new DropdownTestCase("Severity").select(severity);
        log.info("Set {} as a priority",priority);
        new DropdownTestCase("Priority").select(priority);
        log.info("Set {} as a type",type);
        new DropdownTestCase("Type").select(type);
        log.info("Set {} as a layer",layer);
        new DropdownTestCase("Layer").select(layer);
        log.info("Set {} as a behavior", behavior);
        new DropdownTestCase("Behavior").select(behavior);
        log.info("Set {} as an automation status",automationStatus);
        new DropdownTestCase("Automation status").select(automationStatus);
        log.info("Set {} as a flaky condition",flaky);
        new DropdownTestCase("Is flaky").select(flaky);
    }

    @Step("Case creation with valid data")
    public void successfulCaseCreation() {
        caseCreation(TEST_CASE_TITLE,TEST_CASE_DESCRIPTION,TEST_CASE_PRE_CONDITIONS,
                TEST_CASE_POST_CONDITIONS, TEST_CASE_STATUS, TEST_CASE_SEVERITY,
                TEST_CASE_PRIORITY, TEST_CASE_TYPE, TEST_CASE_LAYER, TEST_CASE_FLAKY,
                TEST_CASE_BEHAVIOR, TEST_CASE_AUTOMATION_STATUS);
        save();
    }

}
