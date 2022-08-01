package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestRunDetailsPage {
    public SelenideElement openWizardButton = $(By.id("open-wizard"));
    public SelenideElement passedStatusButton = $x("//a[text()='Passed']");
    public SelenideElement testRunResult = $(By.id("run-case-results-1"));

    public void setTestRunResult(){
        openWizardButton.click();
        passedStatusButton.click();
    }

}
