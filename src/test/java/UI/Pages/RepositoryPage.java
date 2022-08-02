package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class RepositoryPage {
    public SelenideElement createSuiteButton = $(By.id("create-suite-button"));
    public SelenideElement createCaseButton = $(By.id("create-case-button"));
    public SelenideElement testRunsButton = $x("//a[@title='Test Runs']");
    public SelenideElement testDefectsButton = $x("//a[@title='Defects']");
    public SelenideElement testCaseTitle = $x("//div[@class='jp0OXJ nzJYNg']");
    public SelenideElement testSuiteTitle = $x("//a[@class='Vap5jx']");

    @Step("Click create case button and open Create new case page")
    public CreateNewCasePage clickCreateCaseButton() {
        log.info("Click create case button and open Create new case page");
        createCaseButton.click();
        return new CreateNewCasePage();
    }

    @Step("Click create suite button and open Create new suite page")
    public CreateNewSuitePage clickCreateSuiteButton() {
        log.info("Click create suite button and open Create new suite page");
        createSuiteButton.click();
        return new CreateNewSuitePage();
    }

    @Step("Click test runs button and open List of test runs page")
    public ListOfTestRunsPage openTestRunPage() {
        log.info("Click test runs button and open List of test runs page");
        testRunsButton.click();
        return new ListOfTestRunsPage();
    }

    @Step("Click test defects button and open List of defects page")
    public ListOfDefectsPage openDefectsPage(){
        testDefectsButton.click();
        return new ListOfDefectsPage();
    }

}
