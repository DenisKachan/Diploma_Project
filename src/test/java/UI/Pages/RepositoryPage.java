package UI.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {
    public SelenideElement createSuiteButton = $(By.id("create-suite-button"));
    public SelenideElement createCaseButton = $(By.id("create-case-button"));
    public SelenideElement testRunsButton = $x("//a[@title='Test Runs']");
    public SelenideElement testDefectsButton = $x("//a[@title='Defects']");
    public SelenideElement testCaseTitle = $x("//div[@class='jp0OXJ nzJYNg']");
    public SelenideElement testSuiteTitle = $x("//a[@class='Vap5jx']");


    public CreateNewCasePage clickCreateCaseButton() {
        createCaseButton.click();
        return new CreateNewCasePage();
    }

    public CreateNewSuitePage clickCreateSuiteButton() {
        createSuiteButton.click();
        return new CreateNewSuitePage();
    }

    public ListOfTestRunsPage openTestRunPage() {
        testRunsButton.click();
        return new ListOfTestRunsPage();
    }

    public ListOfDefectsPage openDefectsPage(){
        testDefectsButton.click();
        return new ListOfDefectsPage();
    }

}
