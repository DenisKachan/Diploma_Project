package UI.Pages;

import UI.Utils.TestConstants;
import UI.Wrappers.DropdownTestCase;
import UI.Wrappers.InputTestCase;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

public class CreateNewCasePage implements TestConstants {
    public SelenideElement title = $x("//h1[text()='Create test case']");
    public SelenideElement saveButton = $(By.id("save-case"));

    public RepositoryPage save() {
        saveButton.click();
        return new RepositoryPage();
    }
    public void caseCreation(String title, String description, String preConditions, String postConditions,
                             String status, String severity, String priority, String type,
                             String layer, String flaky, String behavior, String automationStatus) {
        new InputTestCase("Title").write(title);
        new InputTestCase("Description").write(description);
        new InputTestCase("Pre-conditions").write(preConditions);
        new InputTestCase("Post-conditions").write(postConditions);
        new DropdownTestCase("Status").select(status);
        new DropdownTestCase("Severity").select(severity);
        new DropdownTestCase("Priority").select(priority);
        new DropdownTestCase("Type").select(type);
        new DropdownTestCase("Layer").select(layer);
        new DropdownTestCase("Is flaky").select(flaky);
        new DropdownTestCase("Behavior").select(behavior);
        new DropdownTestCase("Automation status").select(automationStatus);
    }

    public void successfulCaseCreation() {
        caseCreation(TEST_CASE_TITLE,TEST_CASE_DESCRIPTION,TEST_CASE_PRE_CONDITIONS,
                TEST_CASE_POST_CONDITIONS, TEST_CASE_STATUS, TEST_CASE_SEVERITY,
                TEST_CASE_PRIORITY, TEST_CASE_TYPE, TEST_CASE_LAYER, TEST_CASE_FLAKY,
                TEST_CASE_BEHAVIOR, TEST_CASE_AUTOMATION_STATUS);
        save();
    }

}
