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

    public void createNewCase() {
        new InputTestCase("Title").write(TEST_CASE_TITLE);
        new InputTestCase("Description").write(TEST_CASE_DESCRIPTION);
        new InputTestCase("Pre-conditions").write(TEST_CASE_PRE_CONDITIONS);
        new InputTestCase("Post-conditions").write(TEST_CASE_POST_CONDITIONS);
        new DropdownTestCase("Status").select(TEST_CASE_STATUS);
        new DropdownTestCase("Severity").select(TEST_CASE_SEVERITY);
        new DropdownTestCase("Priority").select(TEST_CASE_PRIORITY);
        new DropdownTestCase("Type").select(TEST_CASE_TYPE);
        new DropdownTestCase("Layer").select(TEST_CASE_LAYER);
        new DropdownTestCase("Is flaky").select(TEST_CASE_FLAKY);
        new DropdownTestCase("Behavior").select(TEST_CASE_BEHAVIOR);
        new DropdownTestCase("Automation status").select(TEST_CASE_AUTOMATION_STATUS);
    }

    public void invalidCaseCreation() {
        new InputTestCase("Title").write("");
        new InputTestCase("Description").write(TEST_CASE_DESCRIPTION);
        new InputTestCase("Pre-conditions").write(TEST_CASE_PRE_CONDITIONS);
        new InputTestCase("Post-conditions").write(TEST_CASE_POST_CONDITIONS);
        new DropdownTestCase("Status").select(TEST_CASE_STATUS);
        new DropdownTestCase("Severity").select(TEST_CASE_SEVERITY);
        new DropdownTestCase("Priority").select(TEST_CASE_PRIORITY);
        new DropdownTestCase("Type").select(TEST_CASE_TYPE);
        new DropdownTestCase("Layer").select(TEST_CASE_LAYER);
        new DropdownTestCase("Is flaky").select(TEST_CASE_FLAKY);
        new DropdownTestCase("Behavior").select(TEST_CASE_BEHAVIOR);
        new DropdownTestCase("Automation status").select(TEST_CASE_AUTOMATION_STATUS);
    }

}
