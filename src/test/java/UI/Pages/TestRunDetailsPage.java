package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Log4j2
public class TestRunDetailsPage {
    public SelenideElement openWizardButton = $(By.id("open-wizard"));
    public SelenideElement passedStatusButton = $x("//a[text()='Passed']");
    public SelenideElement testRunResult = $(By.id("run-case-results-1"));

    @Step("Click open wizard button and set passed status")
    public void setTestRunResult(){
        log.info("Click open wizard button");
        openWizardButton.click();
        log.info("Set passed status");
        passedStatusButton.click();
    }

}
